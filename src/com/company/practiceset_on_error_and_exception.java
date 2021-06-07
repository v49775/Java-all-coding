package com.company;

import java.util.Scanner;
class maxretrivesexception extends Exception{

    public String toString(){
        return "your index is maximum";
    }

    public String getMessage(){
        return "your index is maximum";
    }
}
public class practiceset_on_error_and_exception {
  /*   public static void maxretives throws  maxretrivesexception{
        int [] array=new int[4];
        array[0]=46;
        array[1]=78;
        array[2]=34;
        array[3]=89;
        Scanner sc=new Scanner(System.in);

        boolean flag=true;
        int i=0;
        while(flag && i<5){
            try{
                int ind=sc.nextInt();
                System.out.println("your entire array index no is "+ array[ind]);
                break;

            }
            catch(Exception e){
                System.out.println(e.getMessage());
                i++;
            }
        }


    }



   */
    public static void main(String[] args) {


//        problem 1: write a java program to demonstraite syntax,logical and runtime error
//        syntax error
//        int a=0
/*
//        logical error
//        print a prime no 1 to 11
        System.out.println(2);
        int i=1;
        while(i<=5){
            System.out.println(2*i+1);
            i++;
        }

        //run time error

            int a=5;
            int b=0;
            System.out.println(a/b);


//        problem 2: write a java program that prints "hahaha" during arithmatic exception
//                and "hehehe" during illligal argument exception
        try{
            int a=9999/0;
        }
        catch (IllegalArgumentException e){
            System.out.println("hehehe");
        }
        catch (ArithmeticException e){
            System.out.println("hahaha");
        }


 */


//        problem 3: write a program that allows you to keep accessing  array
//        until a valid index is given.If max is return execute 5 print "error"
        int [] array=new int[4];
        array[0]=46;
        array[1]=78;
        array[2]=34;
        array[3]=89;
        Scanner sc=new Scanner(System.in);

        boolean flag=true;
        int i=0;
        while(flag && i<5){
            try{
                int ind=sc.nextInt();
                System.out.println("your entire array index no is "+ array[ind]);
                break;

            }
            catch(Exception e){
                System.out.println("array ind is invalid");
                i++;
            }
        }



//    problem 4:  modify in program in que 3 to throw a custom exception max retrive are reached
//        System.out.println(maxretrivesexception());
        maxretrivesexception mr=new maxretrivesexception();
        if(i<=5){
            System.out.println(mr.getMessage());
        }


//        problem 5: wrap the progam in que 3 inside a methode which throws your custom exception
    }
}
