package com.mikaelsonbraz.ESTRUTURAL.bridge.transmissions;

import com.mikaelsonbraz.ESTRUTURAL.bridge.platforms.Platform;

public class RecordLive extends Live{

    public RecordLive(Platform platform){
        super.platform = platform;
    }

    public void record(){
        System.out.println("Live sendo gravada...");
    }
}
