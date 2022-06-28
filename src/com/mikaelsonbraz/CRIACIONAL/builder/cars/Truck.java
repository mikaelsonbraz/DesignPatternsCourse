package com.mikaelsonbraz.CRIACIONAL.builder.cars;

import com.mikaelsonbraz.CRIACIONAL.builder.components.CarType;
import com.mikaelsonbraz.CRIACIONAL.builder.components.Engine;
import com.mikaelsonbraz.CRIACIONAL.builder.components.Transmission;

public class Truck {

    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;

    public Truck(CarType carType, int seats, Engine engine, Transmission transmission) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
    }

    public String result(){
        return "Truck with motor: " + this.engine.getPower() + "\nTruck transmission: " + this.transmission;
    }
}
