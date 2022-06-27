package com.mikaelsonbraz.CRIACIONAL.abstractMethod.app;

import com.mikaelsonbraz.CRIACIONAL.abstractMethod.aircraftVehicles.AircraftVehicle;
import com.mikaelsonbraz.CRIACIONAL.abstractMethod.boatVehicles.BoatVehicle;
import com.mikaelsonbraz.CRIACIONAL.abstractMethod.factories.TransportFactory;
import com.mikaelsonbraz.CRIACIONAL.abstractMethod.landVehicles.LandVehicle;

public class Application {

    private LandVehicle landVehicle;
    private AircraftVehicle aircraftVehicle;
    private BoatVehicle boatVehicle;

    public Application(TransportFactory factory){
        landVehicle = factory.createLandVehicle();
        aircraftVehicle = factory.createAircraftVehicle();
        boatVehicle = factory.createBoatVehicle();
    }

    public void startRoute(){
        landVehicle.startRoute();
        aircraftVehicle.startRoute();
        boatVehicle.startRoute();
    }
}
