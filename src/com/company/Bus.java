package com.company;

public class Bus extends Car {
    protected String classification; //Городской, Пригородный, Экскурсионный...
    protected int numberOfSeats;
//    protected int passengerCapacity;
//    protected int Width;
//    protected int Height;

    public Bus(CarMark CarMark, String name, String classification, int numberOfSeats, String color,
               int releaseDate, String number, boolean moves) {
        super(CarMark, name, color, releaseDate, number, moves);

    }

    @Override
    public void move() {

    }

//    public String toString (){
//       return "Bus";
//    }
}
