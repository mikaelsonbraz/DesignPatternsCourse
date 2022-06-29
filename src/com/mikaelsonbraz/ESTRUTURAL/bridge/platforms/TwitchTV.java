package com.mikaelsonbraz.ESTRUTURAL.bridge.platforms;

public class TwitchTV implements Platform {

    public TwitchTV(){
        configureRMTP();
        System.out.println("TwitchTV: transmissão iniciada...");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("TwitchTV: conta autorizada...");
    }

    @Override
    public void authToken() {
        System.out.println("TwitchTV: autorizando aplicação...");
    }
}
