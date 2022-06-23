package com.mikaelsonbraz.CRIACIONAL.factoryMethod.vehicle;

public class Car implements Vehicle{
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando o trajeto...");
    }

    @Override
    public void getCargo() {
        System.out.println("Passageiros pegos...");
    }
}
