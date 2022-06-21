package com.mikaelsonbraz.SOLID.OCP.models;

public class Motorcycle extends Vehicle{

    private int cylinders;

    /*
    Os principios andam de mãos dadas, o principio aberto/fechado complementa o principio da responsabilidade unica
     */

    public Motorcycle() {
    }

    public Motorcycle(String color, int year, int cylinders) {
        super(color, year);
        this.cylinders = cylinders;

        startVehicle();
    }

    public void startVehicle(){
        System.out.println("A moto está ligando... " + this.getColor() + ", ano " + this.getYear() +
                ", " + this.cylinders + " cilindradas");
    }
}
