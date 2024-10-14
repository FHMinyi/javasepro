package com.fhminyi.arraylist;

public class Food {
    private String name;
    private double price;
    private String 描述;

    public Food(String name, double price, String 描述) {
        this.name = name;
        this.price = price;
        this.描述 = 描述;
    }

    public Food() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String get描述() {
        return 描述;
    }

    public void set描述(String 描述) {
        this.描述 = 描述;
    }
}
