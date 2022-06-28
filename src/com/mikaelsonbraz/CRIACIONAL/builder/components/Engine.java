package com.mikaelsonbraz.CRIACIONAL.builder.components;

public class Engine {

    private int power;

    public Engine() {
    }

    public Engine(int power) {
        this.power = power;
    }

    public int getPower(){
        return this.power;
    }
}
