package com.mikaelsonbraz.ESTRUTURAL.bridge.platforms;

public class YouTube implements Platform{

    public YouTube(){
        configureRMTP();
        System.out.println("YouTube: transmissão iniciada...");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("YouTube: conta autorizada...");
    }

    @Override
    public void authToken() {
        System.out.println("YouTube: autorizando aplicação...");
    }
}
