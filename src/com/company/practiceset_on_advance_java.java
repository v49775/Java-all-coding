package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;

public class practiceset_on_advance_java {
    public static void main(String[] args) {
//      problem 1:  create an array lest and store a names of 10 students inside it.print it using a for each loop
        ArrayList<String> arr=new ArrayList(10);
        arr.add("vinayak");
        arr.add("varad");
        arr.add("pranav");
        arr.add("sujal");
        arr.add("abhishek");
        arr.add("aniket");
        arr.add("abhijit");
        arr.add("tejas");
        arr.add("akash");
        arr.add("dhananjay");
        for (Object o:arr){
            System.out.println(o);

        }

//        problem 2: create a set in java.try to store duplicate element inside this set and
//                      verify that only once instance is store
        HashSet<Integer> ss=new HashSet<>();
        ss.add(54);
        ss.add(45);
        ss.add(78);
        ss.add(8);
        ss.add(34);
        ss.add(9);
        ss.add(34);
        System.out.println(ss);


//        problem 3 : use the date class in java.to print time in the following format -- 00:00:00
        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt.getHour()+":"+dt.getMinute()+":"+dt.getSecond());





    }

}
