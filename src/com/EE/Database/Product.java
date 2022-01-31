package com.EE.Database;

public class Product
{
    private Long id;
    private String name;
    private String category;
    private int amount;
    private int price;
    private Countries manufacturer;

    public Product() {}

    public Product(Long id, String name, String category, int amount, int price, Countries manufacturer) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.amount = amount;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Countries getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Countries manufacturer) {
        this.manufacturer = manufacturer;
    }

}
