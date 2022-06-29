package com.mikaelsonbraz.ESTRUTURAL.bridge.transmissions;

import com.mikaelsonbraz.ESTRUTURAL.bridge.platforms.Platform;

public class AdvancedLive extends Live{

    public AdvancedLive(Platform platform){
        super.platform = platform;
    }

    public void subtitles(){
        System.out.println("Legendas ativadas na transmissão...");
    }

    public void comments(){
        System.out.println("Comentários liberados na plataforma...");
    }
}
