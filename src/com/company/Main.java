package com.company;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import static java.util.Calendar.*;

public class Main {

    public static void main(String[] args) {
        Car cityBus = new Bus(CarMark.MERCEDES, "Ciatro", "городской автобус",
                33, "Бежевый", 2016, "48-15xo", true);

        System.out.println(cityBus.toString());





    }
}
