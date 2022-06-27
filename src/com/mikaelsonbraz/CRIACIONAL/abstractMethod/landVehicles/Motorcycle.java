package com.mikaelsonbraz.CRIACIONAL.abstractMethod.landVehicles;

public class Motorcycle implements LandVehicle{

    @Override
    public void startRoute() {
        System.out.println("-99--MOTORCYCLE-");
        getCargo();
        System.out.println("Iniciando o trajeto...");
    }

    @Override
    public void getCargo() {
        System.out.println("Encomenda pega.");
    }
}
