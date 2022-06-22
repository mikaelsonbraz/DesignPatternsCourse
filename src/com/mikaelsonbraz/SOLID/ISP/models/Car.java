package com.mikaelsonbraz.SOLID.ISP.models;

public class Car implements VehicleCar{

    private String color;
    private int year;
    private double engine;
    private int seats;

    public Car() {
    }

    public Car(String color, int year, double engine, int seats) {

        configureCar(color, year, engine, seats);
        startVehicle();
    }

    @Override
    public void configureCar(String color, int year, double engine, int seats) {
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.seats = seats;
        System.out.println("Criando um carro... " + this.color + ", ano " + this.year + ", motor " + this.engine + ", " + this.seats + " assentos");
    }

    @Override
    public void startVehicle() {
        System.out.println("Ligando o carro...");
    }
}
