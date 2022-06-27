package com.mikaelsonbraz.CRIACIONAL.abstractMethod.factories;

import com.mikaelsonbraz.CRIACIONAL.abstractMethod.aircraftVehicles.AircraftVehicle;
import com.mikaelsonbraz.CRIACIONAL.abstractMethod.aircraftVehicles.Airplane;
import com.mikaelsonbraz.CRIACIONAL.abstractMethod.landVehicles.Car;
import com.mikaelsonbraz.CRIACIONAL.abstractMethod.landVehicles.LandVehicle;

public class UberTransport implements TransportFactory{

    @Override
    public LandVehicle createLandVehicle() {
        return new Car();
    }

    @Override
    public AircraftVehicle createAircraftVehicle() {
        return new Airplane();
    }
}
