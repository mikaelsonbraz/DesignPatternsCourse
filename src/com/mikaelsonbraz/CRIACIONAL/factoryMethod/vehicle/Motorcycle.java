package com.mikaelsonbraz.CRIACIONAL.factoryMethod.vehicle;

public class Motorcycle implements Vehicle{
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando a entrega...");
    }

    @Override
    public void getCargo() {
        System.out.println("Encomenda pega...");
    }
}
