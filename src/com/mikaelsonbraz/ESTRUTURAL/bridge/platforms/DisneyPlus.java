package com.mikaelsonbraz.ESTRUTURAL.bridge.platforms;

public class DisneyPlus implements Platform{

    public DisneyPlus(){
        configureRMTP();
        System.out.println("DisneyPlus: transmissão iniciada...");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("DisneyPlus: conta autorizada...");
    }

    @Override
    public void authToken() {
        System.out.println("DisneyPlus: autorizando aplicação...");
    }
}
