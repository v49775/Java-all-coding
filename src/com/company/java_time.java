package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class java_time {
    public static void main(String[] args) {
        LocalDate d=LocalDate.now();
        System.out.println(d);
        LocalTime t=LocalTime.now();
        System.out.println(t);
        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);
        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-yyyy -- E a");
        String date=dt.format(df);
        System.out.println(date);

    }
}
