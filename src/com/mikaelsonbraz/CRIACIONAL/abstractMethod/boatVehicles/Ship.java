package com.mikaelsonbraz.CRIACIONAL.abstractMethod.boatVehicles;

public class Ship implements BoatVehicle{

    @Override
    public void startRoute() {
        System.out.println("-UBER--SHIP-");
        getCargo();
        System.out.println("Iniciando a navegação...");
    }

    @Override
    public void getCargo() {
        System.out.println("Carga a bordo.");
    }
}
