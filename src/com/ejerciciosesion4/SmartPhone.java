package com.ejerciciosesion4;

public class SmartPhone extends SmartDevice{

    String sistemaOperativo;
    int memoryCapacity;
    int RAM_SIZE;

    public SmartPhone(String marca, String modelo, int anoFabricacion, String sistemaOperativo, int memoryCapacity, int RAM_SIZE) {
        super(marca, modelo, anoFabricacion);
        this.sistemaOperativo = sistemaOperativo;
        this.memoryCapacity = memoryCapacity;
        this.RAM_SIZE = RAM_SIZE;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anoFabricacion=" + anoFabricacion +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", memoryCapacity=" + memoryCapacity +
                ", RAM_SIZE=" + RAM_SIZE +
                '}';
    }
}
