package com.mikaelsonbraz.CRIACIONAL.abstractMethod.aircraftVehicles;

public class Airplane implements AircraftVehicle{

    @Override
    public void startRoute() {
        System.out.println("-UBER--AIRPLANE-");
        wind();
        getCargo();
        System.out.println("Iniciando a viagem...");
    }

    @Override
    public void getCargo() {
        System.out.println("Carga a bordo, voo autorizado.");
    }

    @Override
    public void wind(){
        System.out.println("Ventos a 32km/h na direção leste.");
    }
}
