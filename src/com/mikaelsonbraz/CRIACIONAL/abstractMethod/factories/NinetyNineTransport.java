package com.mikaelsonbraz.CRIACIONAL.abstractMethod.factories;

import com.mikaelsonbraz.CRIACIONAL.abstractMethod.aircraftVehicles.AircraftVehicle;
import com.mikaelsonbraz.CRIACIONAL.abstractMethod.aircraftVehicles.Helicopter;
import com.mikaelsonbraz.CRIACIONAL.abstractMethod.boatVehicles.BoatVehicle;
import com.mikaelsonbraz.CRIACIONAL.abstractMethod.boatVehicles.SpeedBoat;
import com.mikaelsonbraz.CRIACIONAL.abstractMethod.landVehicles.LandVehicle;
import com.mikaelsonbraz.CRIACIONAL.abstractMethod.landVehicles.Motorcycle;

public class NinetyNineTransport implements TransportFactory{

    @Override
    public LandVehicle createLandVehicle() {
        return new Motorcycle();
    }

    @Override
    public AircraftVehicle createAircraftVehicle() {
        return new Helicopter();
    }

    @Override
    public BoatVehicle createBoatVehicle(){
        return new SpeedBoat();
    }
}
