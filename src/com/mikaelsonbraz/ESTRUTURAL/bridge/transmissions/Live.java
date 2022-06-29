package com.mikaelsonbraz.ESTRUTURAL.bridge.transmissions;

import com.mikaelsonbraz.ESTRUTURAL.bridge.platforms.Platform;

public class Live implements Transmission {

    protected Platform platform;

    public Live(){
    }

    public Live(Platform platform){
        this.platform = platform;
    }

    @Override
    public void broadcasting() {
        System.out.println("Iniciando a transmissão...");
    }

    @Override
    public void result() {
        System.out.println("***** ON AIR *****");
    }
}
