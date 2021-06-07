package com.company;
import java.util.*;
import java.util.GregorianCalendar;
public class calender_class {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance(/*TimeZone.getTimeZone("America/Guatemala")*/);
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());
        System.out.println(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
        GregorianCalendar gc=new GregorianCalendar();
        System.out.println(gc.isLeapYear(2021));
        boolean k=gc.isLeapYear(2020);
        if(k){
            System.out.println("it is leap year");
        }
        else{
            System.out.println("it is not leap year");
        }

        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
        System.out.println(TimeZone.getAvailableIDs()[3]);
        System.out.println(TimeZone.getAvailableIDs()[4]);

    }
}
