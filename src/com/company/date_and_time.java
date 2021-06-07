package com.company;
import java.util.*;
public class date_and_time {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);
//        System.out.println(System.currentTimeMillis());
//        System.out.println(Long.MAX_VALUE);
        Date d=new Date();
        System.out.println(d);
        System.out.println(d.getTime());
//        System.out.println(d.getDate());  -----> this function are depricated
//        System.out.println(d.getHours());         dosnt used it
//        System.out.println(d.getTimezoneOffset());
    }
}
