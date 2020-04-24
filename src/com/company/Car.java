package com.company;

import java.util.Objects;

public abstract class Car implements Movable {
    protected CarMark carMark;
    protected String name;
    protected String color;
    protected int releaseDate;
    protected String number;
    protected boolean moves;


//    public void move() {
//
//    }
    public abstract void move();

    public void toBrake() {
    }

    public Car(CarMark CarMark, String name, String color, int releaseDate, String number, boolean moves) {
        this.carMark = CarMark;
        this.name = name;
        this.color = color;
        this.releaseDate = releaseDate;
        this.number = number;
        this.moves = moves;
    }


    @Override
    public String toString() {
        return "Car{" +
                "марка=" + carMark +
                ", модель='" + name + '\'' +
                ", цвет='" + color + '\'' +
                ", дата выпуска=" + releaseDate +
                ", номер='" + number + '\'' +
                ", //На ходу? ='" + moves + '\'' +
                '}' + "\nДата и страна основания комани: " + carMark.getDateOfEstablishment() + ", " + carMark.getCountry();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return releaseDate == car.releaseDate &&
                carMark == car.carMark &&
                name.equals(car.name) &&
                color.equals(car.color) &&
                number.equals(car.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carMark, name, color, releaseDate, number);
    }

    public CarMark getCarMark() {
        return carMark;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public String getNumber() {
        return number;
    }

    public boolean isMoves() {
        return moves;
    }

    public void setCarMark(CarMark carMark) {
        this.carMark = carMark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setMoves(boolean moves) {
        this.moves = moves;
    }
}
