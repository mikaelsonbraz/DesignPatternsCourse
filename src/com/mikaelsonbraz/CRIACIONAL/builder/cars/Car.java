package com.mikaelsonbraz.CRIACIONAL.builder.cars;

import com.mikaelsonbraz.CRIACIONAL.builder.components.CarType;
import com.mikaelsonbraz.CRIACIONAL.builder.components.Engine;
import com.mikaelsonbraz.CRIACIONAL.builder.components.Transmission;

public class Car {

    private final CarType carType;
    private final int seats;
    private final String color;
    private final Engine engine;
    private final Transmission transmission;

    public Car(CarType carType, int seats, String color, Engine engine, Transmission transmission) {
        this.carType = carType;
        this.seats = seats;
        this.color = color;
        this.engine = engine;
        this.transmission = transmission;
    }

    public CarType getCarType() {
        return carType;
    }

    public int getSeats() {
        return seats;
    }

    public String getColor() { return color; }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }
}
