package com.ejerciciosesion4;

public class Main {

    public static void main(String[] args) {

        SmartPhone xiaomimi9 = new SmartPhone("xiaomi", "Mi 9", 2019, "MIUI", 128, 6);
        SmartWatch amazfit = new SmartWatch("amazfit", "Bip Lite", 2019, true, false, false);

        System.out.println(xiaomimi9);
        System.out.println(amazfit);

    }
}
