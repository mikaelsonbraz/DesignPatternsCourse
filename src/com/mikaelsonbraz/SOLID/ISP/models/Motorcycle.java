package com.mikaelsonbraz.SOLID.ISP.models;

public class Motorcycle implements VehicleMotorcycle{

    private String color;
    private int year;
    private int cylinders;

    public Motorcycle() {
    }

    public Motorcycle(String color, int year, int cylinders) {

        configureMotorcycle(color, year, cylinders);
        startVehicle();
    }


    @Override
    public void configureMotorcycle(String color, int year, int cylinders) {
        this.color = color;
        this.year = year;
        this.cylinders = cylinders;
        System.out.println("Criando uma moto... " + this.color + ", ano " + this.year + ", " + this.cylinders + " cilindradas");
    }

    @Override
    public void startVehicle() {
        System.out.println("Ligando a moto...");
    }
}
