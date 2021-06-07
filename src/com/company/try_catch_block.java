package com.company;

public class try_catch_block {
    public static void main(String[] args) {
        int a=60000;
        int b=0;
        try {
            int c = a / b;
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println("sorry we faild to division for some error");
            System.out.println(e);
        }

        System.out.println("end of program");
    }
}
