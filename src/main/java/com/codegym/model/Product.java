package com.codegym.model;

public class Product {
    int id;
    String name;
    String cost;
    String description;

    public Product() {
    }

    public Product(String name, String cost, String description) {
        this.name = name;
        this.cost = cost;
        this.description = description;
    }

    public Product(String name, String cost) {
        this.name = name;
        this.cost = cost;
    }

    public Product(int id, String name, String cost, String description) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
