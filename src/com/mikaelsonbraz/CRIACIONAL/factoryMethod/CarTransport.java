package com.mikaelsonbraz.CRIACIONAL.factoryMethod;

import com.mikaelsonbraz.CRIACIONAL.factoryMethod.vehicle.Car;
import com.mikaelsonbraz.CRIACIONAL.factoryMethod.vehicle.Vehicle;

public class CarTransport extends Transport{

    @Override
    protected Vehicle createTransport() {
        return new Car();
    }
}
