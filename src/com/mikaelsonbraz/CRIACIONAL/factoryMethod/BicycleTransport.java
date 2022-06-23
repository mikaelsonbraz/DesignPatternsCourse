package com.mikaelsonbraz.CRIACIONAL.factoryMethod;

import com.mikaelsonbraz.CRIACIONAL.factoryMethod.Transport;
import com.mikaelsonbraz.CRIACIONAL.factoryMethod.vehicle.Bicycle;
import com.mikaelsonbraz.CRIACIONAL.factoryMethod.vehicle.Vehicle;

public class BicycleTransport extends Transport {
    @Override
    protected Vehicle createTransport() {
        return new Bicycle();
    }
}
