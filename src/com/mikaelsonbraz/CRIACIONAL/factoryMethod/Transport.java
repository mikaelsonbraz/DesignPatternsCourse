package com.mikaelsonbraz.CRIACIONAL.factoryMethod;

import com.mikaelsonbraz.CRIACIONAL.factoryMethod.vehicle.Vehicle;

public abstract class Transport {

    void startTransport(){
        Vehicle vehicle = createTransport();
        vehicle.startRoute();
    }

    protected abstract Vehicle createTransport();
}
