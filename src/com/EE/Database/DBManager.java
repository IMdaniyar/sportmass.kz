package com.EE.Database;

import com.mysql.cj.exceptions.DataReadException;

import java.sql.*;
import java.util.ArrayList;

public class DBManager
{
    private static Connection connection;
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/sportmass?useUnicode=true&serverTimezone=UTC","root","");
        }
        catch (ClassNotFoundException exception)
        {
            exception.printStackTrace();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public static boolean addProduct(Product product)
    {
        int rows = 0;
        try
        {
            PreparedStatement preparedStatement = connection.prepareStatement("" +
                    "INSERT  INTO products(id, name, category, amount, price, manufacturer_id)" +
                    "VALUES(NULL , ?,?,?,?,?)" + "");

            preparedStatement.setString(1,product.getName());
            preparedStatement.setString(2,product.getCategory());
            preparedStatement.setInt(3,product.getAmount());
            preparedStatement.setInt(4,product.getPrice());
            preparedStatement.setLong(5,product.getManufacturer().getId());

            rows = preparedStatement.executeUpdate();
            preparedStatement.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return rows>0;
    }

    public static ArrayList<Product> getProduct() throws SQLException
    {
        ArrayList<Product> products = new ArrayList<>();

        PreparedStatement statement = connection.prepareStatement("" + "SELECT p.id, p.name, p.category, p.amount, p.price, p.manufacturer_id, c.name As countryName, c.short_name\n" +
                "FROM products p\n" +
                "INNER JOIN countries c on p.manufacturer_id = c.id" + "ORDER BY p.price DESC");

        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next())
        {
            products.add(new Product(
                    resultSet.getLong("id"),
                    resultSet.getString("name"),
                    resultSet.getString("category"),
                    resultSet.getInt("amount"),
                    resultSet.getInt("price"),
                    new Countries(
                            resultSet.getLong("manufacturer_id"),
                            resultSet.getString("countryName"),
                            resultSet.getString("short_name")
                    )
            ));
        }
        statement.close();
        return products;
    }
    //тут 23 минута
    public static ArrayList<Countries> getCountries() throws SQLException
    {
        ArrayList<Countries> countries = new ArrayList<>();

        PreparedStatement statement = connection.prepareStatement("SELECT * FROM countries");

        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next())
        {
            countries.add(new Countries(
                    resultSet.getLong("id"),
                    resultSet.getString("name"),
                    resultSet.getString("short_name")
            ));

        }
        statement.close();
        return countries;
    }

    public static Product getProductById (Long id) throws SQLException {
        Product product = null;
        PreparedStatement statement = connection.prepareStatement("SELECT p.id, p.name, p.category, p.amount, p.price, p.manufacturer_id, c.name As countryName, c.short_name\n" +
                "FROM products p\n" +
                "INNER JOIN countries c on p.manufacturer_id = c.id" + "WHERE p.id = ?");

        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()){
            product = new Product(
                    id,
                    resultSet.getString("name"),
                    resultSet.getString("category"),
                    resultSet.getInt("amount"),
                    resultSet.getInt("price"),
                    new Countries(
                            resultSet.getLong("manufacturer_id"),
                            resultSet.getString("countryName"),
                            resultSet.getString("short_name")
                    )
            );
        }
        return product;
    }

    public static void editProduct (Product product) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("" +
                "UPDATE products SET name = ?, category = ?, amount = ? price = ? WHERE id = ?");

        statement.executeUpdate();
    }

    public static Countries getCountry(Long id) throws SQLException
    {
        Countries country = null;

        PreparedStatement statement = connection.prepareStatement("SELECT * FROM countries WHERE id= ? LIMIT 1");
        statement.setLong(1,id);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next())
        {
            country = new Countries(
                    resultSet.getLong("id"),
                    resultSet.getString("name"),
                    resultSet.getString("short_name")
            );

        }
        statement.close();
        return country;
    }

    public static Users getUsers(String email)
    {
        Users users = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM users WHERE email = ?");
            preparedStatement.setString(1, email);
            ResultSet resultSet = preparedStatement.executeQuery();

            if(resultSet.next())
            {
                users = new Users(
                        resultSet.getLong("id"),
                        resultSet.getString("email"),
                        resultSet.getString("password"),
                        resultSet.getString("full_name")
                );
            }
            preparedStatement.close();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return users;
    }

    public static boolean addUser(Users users)
    {
        int rows =0;
        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO users (email, password, full_name)"
            + "VALUES (?,?,?)");

            statement.setString(1, users.getEmail());
            statement.setString(2, users.getPassword());
            statement.setString(3, users.getFull_name());

            rows = statement.executeUpdate();
            statement.close();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return rows>0;

    }

}
