package com.mikaelsonbraz.ESTRUTURAL.bridge;

import com.mikaelsonbraz.ESTRUTURAL.bridge.platforms.*;
import com.mikaelsonbraz.ESTRUTURAL.bridge.transmissions.AdvancedLive;
import com.mikaelsonbraz.ESTRUTURAL.bridge.transmissions.Live;
import com.mikaelsonbraz.ESTRUTURAL.bridge.transmissions.RecordLive;

public class Main {

    public static void main(String[] args) {
        //startLive(new YouTube());
        //startLive(new TwitchTV());
        //startLive(new FacebookLive());
        startLive(new DisneyPlus());
    }

    public static void startLive(Platform platform){
        /*
        // LIVE
        System.out.println("...Aguarde!");
        Live live = new Live(platform);
        live.broadcasting();
        live.result();

         // ADVANCE LIVE
        System.out.println("...Aguarde! [TRANSMISSÃO AVANÇADA]");
        AdvancedLive advancedLive = new AdvancedLive(platform);
        advancedLive.broadcasting();
        advancedLive.result();
        advancedLive.subtitles();
        advancedLive.comments();

         */

        // RECORD LIVE
        System.out.println("...Aguarde! [TRANSMISSÃO SENDO GRAVADA]");
        RecordLive recordLive = new RecordLive(platform);
        recordLive.broadcasting();
        recordLive.result();
        recordLive.record();
    }
}
