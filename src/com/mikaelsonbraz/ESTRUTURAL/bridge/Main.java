package com.mikaelsonbraz.ESTRUTURAL.bridge;

import com.mikaelsonbraz.ESTRUTURAL.bridge.platforms.FacebookLive;
import com.mikaelsonbraz.ESTRUTURAL.bridge.platforms.Platform;
import com.mikaelsonbraz.ESTRUTURAL.bridge.platforms.TwitchTV;
import com.mikaelsonbraz.ESTRUTURAL.bridge.platforms.YouTube;
import com.mikaelsonbraz.ESTRUTURAL.bridge.transmissions.AdvancedLive;
import com.mikaelsonbraz.ESTRUTURAL.bridge.transmissions.Live;

public class Main {

    public static void main(String[] args) {
        //startLive(new YouTube());
        //startLive(new TwitchTV());
        startLive(new FacebookLive());
    }

    public static void startLive(Platform platform){
        /*
        System.out.println("...Aguarde!");
        Live live = new Live(platform);
        live.broadcasting();
        live.result();
         */
        System.out.println("...Aguarde! [TRANSMISSÃO AAVANÇADA]");
        AdvancedLive advancedLive = new AdvancedLive(platform);
        advancedLive.broadcasting();
        advancedLive.result();
        advancedLive.subtitles();
        advancedLive.comments();
    }
}
