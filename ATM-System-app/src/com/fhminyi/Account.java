package com.fhminyi;

public class Account {
    private String cardID;
    private String name;
    private String password;
    private double money;
    private double limit;

    public Account(String cardID, String name, String password, double money, double limit) {
        this.cardID = cardID;
        this.name = name;
        this.password = password;
        this.money = money;
        this.limit = limit;
    }

    public Account() {
    }

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }
}
