package com.EE.Servlets;

import com.EE.Database.Countries;
import com.EE.Database.DBManager;
import com.EE.Database.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet("/addProduct")
public class AddProductServlet extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String category = request.getParameter("category");
        int amount = Integer.parseInt(request.getParameter("amount"));
        int price = Integer.parseInt(request.getParameter("price"));

       // DBManager.addProduct(new Product(null,name,category,amount, price));
        response.sendRedirect("/addProduct?success");
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Countries> countries = null;

        try {
            countries = DBManager.getCountries();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.setAttribute("countries", countries);
        request.getRequestDispatcher("/addProduct.jsp").forward(request,response);
    }

}
