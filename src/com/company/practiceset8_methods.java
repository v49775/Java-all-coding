package com.company;

import java.util.Arrays;

public class practiceset8_methods {
    static void mult_table(int n){

        for(int i=1;i<=10;i++){
            int product=(n*i);
            System.out.format("%d x %d = %d \n",n,i,product);
        }

    }
    static void pattern(int n){
        for(int i=0;i<n;i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    static int sumRec(int n){
        if(n == 1){
            return 1;
        }
        else{
            return n + sumRec(n-1);
        }
    }

    static void pattern2(int n){
        for(int i=n;i>=0;i--) {
            for(int j=i-1;j>=0;j--){
                System.out.print("* ");
           }
            System.out.println("");
        }
    }

    static int fib(int n){
       /* if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }*/
        if(n==1 || n==2){
            return n-1;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }


    static int avg(int ...arr){
        int sum=0;
        int average=0;
        //int result=0;
        for (int a:arr){
            sum +=a;
            average= (sum)/(arr.length);
        }
        return average;
    }

    static void celsiusToFahrenheit(int n){
        float result= (n *(1.8f))+32;
        //celsius to fahrenheit = (1°C × 9/5) + 32 = 33.8°F
        System.out.println(result);
    }


    public static void main(String[] args) {
        //quetion1: write a java program to create a multiplication table
        //int a=3;
        //mult_table(a);

        //que 2: write a java program to print a * pattern
        //pattern(5);

        // que 3: write a recurcive fun to calculate sum of first n natural nos.
        /*int c = sumRec(4);
        int d = sumRec(9);
        System.out.println(c);
        System.out.println(d);*/

        //que 4: write a fun to print a pattern of opposite to que 2
        //pattern2(6);


        // que 5: write a fun to n th term of fibonacci series using reccursion
        // fibonacci series = 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
        //int result= fib(7);
        //System.out.println(result);



        // que 6 : write a function to avrage of 2 set of numbers pass as arguments
        //int n =avg(1,2,3,4,5);
        //System.out.println(n);


        // que 7 : write a function tto convert celsius temp into fahrenheit
        celsiusToFahrenheit(7);

    }
}
