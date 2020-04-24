package com.company;

import com.sun.org.apache.xerces.internal.impl.dv.xs.YearMonthDV;
import javafx.animation.KeyFrame;

import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;

public enum CarMark {
    MERCEDES("mercedes-Benz", "Мерседес", "Германия", new int[]{1926, Calendar.JUNE, 28}),//28 июня 1926
    BMW("bmv", "БМВ", "Германия", new int[]{1917, Calendar.JULY, 20}),
    MAZDA("mazda", "мазда", "Япония", new int[]{1920, Calendar.JANUARY, 30}),
    TESLA("tesla", "тесла", "США", new int[]{2003, Calendar.JULY, 1} ),
    LADA("lada", "лада", "Россия", new int[]{1966, Calendar.JULY, 20});

    private String name;
    private String nameRu;
    private String country;
    private Calendar dateOfEstablishment;

    CarMark(String name, String nameRu, String country, int [] dateOfEstablishment){
        this.name = name;
        this.nameRu = nameRu;
        this.country = country;
        this.dateOfEstablishment = new Calendar.Builder().setDate(dateOfEstablishment[0],dateOfEstablishment[1],dateOfEstablishment[2]).build();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameRu() {
        return nameRu;
    }

    public void setNameRu(String nameRu) {
        this.nameRu = nameRu;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDateOfEstablishment() {
        return new SimpleDateFormat("d MMMM yyyy").format(this.dateOfEstablishment.getTime());
    }

    public void setDateOfEstablishment(Calendar dateOfEstablishment) {
        this.dateOfEstablishment = dateOfEstablishment;
    }
}

