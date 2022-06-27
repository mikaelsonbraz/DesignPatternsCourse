package com.mikaelsonbraz.CRIACIONAL.abstractMethod.factories;

import com.mikaelsonbraz.CRIACIONAL.abstractMethod.aircraftVehicles.AircraftVehicle;
import com.mikaelsonbraz.CRIACIONAL.abstractMethod.boatVehicles.BoatVehicle;
import com.mikaelsonbraz.CRIACIONAL.abstractMethod.landVehicles.LandVehicle;

public interface TransportFactory {

    LandVehicle createLandVehicle();
    AircraftVehicle createAircraftVehicle();
    BoatVehicle createBoatVehicle();

}
