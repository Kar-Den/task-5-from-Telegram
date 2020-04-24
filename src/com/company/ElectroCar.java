package com.company;

public class ElectroCar extends Car {
    private int batteryCapacity;
    private String oneBatteryKM;


    public ElectroCar(CarMark CarMark, String name, String color, int releaseDate, String number, boolean moves,
                      int batteryCapacity, String oneBatteryKM) {
        super(CarMark, name, color, releaseDate, number, moves);
    }

    public void move() {

    }
}

