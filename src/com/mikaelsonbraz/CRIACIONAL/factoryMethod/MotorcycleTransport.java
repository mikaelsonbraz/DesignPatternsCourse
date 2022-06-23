package com.mikaelsonbraz.CRIACIONAL.factoryMethod;

import com.mikaelsonbraz.CRIACIONAL.factoryMethod.vehicle.Motorcycle;
import com.mikaelsonbraz.CRIACIONAL.factoryMethod.vehicle.Vehicle;

public class MotorcycleTransport extends Transport{

    @Override
    protected Vehicle createTransport() {
        return new Motorcycle();
    }
}
