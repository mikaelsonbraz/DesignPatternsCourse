package com.mikaelsonbraz.ESTRUTURAL.bridge.platforms;

public class FacebookLive implements Platform{

    public FacebookLive(){
        configureRMTP();
        System.out.println("FacebookLive: transmissão iniciada...");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("FacebookLive: conta autorizada...");
    }

    @Override
    public void authToken() {
        System.out.println("FacebookLive: autorizando aplicação...");
    }
}
