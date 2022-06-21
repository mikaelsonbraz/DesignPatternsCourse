package com.mikaelsonbraz.SOLID.OCP.models;

public class Vehicle {

    private String color;
    private int year;

    public Vehicle() {
    }

    public Vehicle(String color, int year) {
        this.color = color;
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }
}
