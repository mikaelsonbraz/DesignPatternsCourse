package com.mikaelsonbraz.SOLID.OCP.models;

public class Car extends Vehicle{

    private int seats;
    private double engine;

    /*
    O príncipio Aberto/Fechado recomenda que toda classe deva somente estar aberta para extensão, nunca para
    modificação

    Dois bons jeitos de se conseguir isso são a herança ou o uso de interfaces
     */

    public Car() {
    }

    public Car(String color, int year, int seats, double engine) {
        super(color, year);
        this.seats = seats;
        this.engine = engine;

        startVehicle();
    }

    public void startVehicle(){
        System.out.println("O carro está ligando... " + this.getColor() + ", ano: " + this.getYear() +
                ", quantidade de assentos: " + this.seats + ", motor " + this.engine);
    }
}
