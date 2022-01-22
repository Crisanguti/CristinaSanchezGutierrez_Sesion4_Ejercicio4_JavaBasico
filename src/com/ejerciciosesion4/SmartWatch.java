package com.ejerciciosesion4;

public class SmartWatch extends SmartDevice {

    boolean isSumergible;
    boolean supportsSpotify;
    boolean supportsIphone;

    public SmartWatch(String marca, String modelo, int anoFabricacion, boolean isSumergible, boolean supportsSpotify, boolean supportsIphone) {
        super(marca, modelo, anoFabricacion);
        this.isSumergible = isSumergible;
        this.supportsSpotify = supportsSpotify;
        this.supportsIphone = supportsIphone;
    }
}
