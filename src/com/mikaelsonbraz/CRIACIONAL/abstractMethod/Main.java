package com.mikaelsonbraz.CRIACIONAL.abstractMethod;

import com.mikaelsonbraz.CRIACIONAL.abstractMethod.app.Application;
import com.mikaelsonbraz.CRIACIONAL.abstractMethod.factories.NinetyNineTransport;
import com.mikaelsonbraz.CRIACIONAL.abstractMethod.factories.TransportFactory;
import com.mikaelsonbraz.CRIACIONAL.abstractMethod.factories.UberTransport;

public class Main {

    public static Application configureApplication(){
        Application app;
        TransportFactory factory = null;

        String company = "uber";

        switch (company){
            case "uber" -> factory = new UberTransport();
            case "99" -> factory = new NinetyNineTransport();
        }

        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.startRoute();
    }
}
