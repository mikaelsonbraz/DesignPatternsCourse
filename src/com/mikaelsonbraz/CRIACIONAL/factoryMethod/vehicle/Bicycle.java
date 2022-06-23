package com.mikaelsonbraz.CRIACIONAL.factoryMethod.vehicle;

public class Bicycle implements Vehicle{
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciado o delivery...");
    }

    @Override
    public void getCargo() {
        System.out.println("Encomenda pega...");
    }
}
