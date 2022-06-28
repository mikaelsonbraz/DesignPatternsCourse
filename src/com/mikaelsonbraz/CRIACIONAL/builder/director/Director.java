package com.mikaelsonbraz.CRIACIONAL.builder.director;

import com.mikaelsonbraz.CRIACIONAL.builder.builders.Builder;
import com.mikaelsonbraz.CRIACIONAL.builder.components.CarType;
import com.mikaelsonbraz.CRIACIONAL.builder.components.Engine;
import com.mikaelsonbraz.CRIACIONAL.builder.components.Transmission;

public class Director {

    public void constructSedanCar(Builder builder){
        builder.setCarType(CarType.SEDAN);
        builder.setSeats(5);
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setEngine(new Engine(1600));
    }

    public void contructTruck(Builder builder){
        builder.setCarType(CarType.TRUCK);
        builder.setSeats(3);
        builder.setTransmission(Transmission.MANUAL);
        builder.setEngine(new Engine(13000));
    }
}
