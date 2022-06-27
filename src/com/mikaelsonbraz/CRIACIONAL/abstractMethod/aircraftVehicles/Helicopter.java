package com.mikaelsonbraz.CRIACIONAL.abstractMethod.aircraftVehicles;

public class Helicopter implements AircraftVehicle{

    @Override
    public void startRoute() {
        System.out.println("-99--HELICOPTER-");
        wind();
        getCargo();
        System.out.println("Inciando o trajeto...");
    }

    @Override
    public void getCargo() {
        System.out.println("Passageiros a bordo, vvoo autorizado.");
    }

    @Override
    public void wind(){
        System.out.println("Ventos a 20km/h na direção nordeste.");
    }
}
