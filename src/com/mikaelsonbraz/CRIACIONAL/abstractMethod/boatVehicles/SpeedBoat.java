package com.mikaelsonbraz.CRIACIONAL.abstractMethod.boatVehicles;

public class SpeedBoat implements BoatVehicle{

    @Override
    public void startRoute() {
        System.out.println("-99--SPEEDBOAT-");
        getCargo();
        System.out.println("Iniciando o transporte...");
    }

    @Override
    public void getCargo() {
        System.out.println("Passageiros pegos.");
    }
}
