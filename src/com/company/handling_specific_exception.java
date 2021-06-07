package com.company;
import java.lang.reflect.Array;
import java.util.Scanner;

class fun{
    public fun(){
    int [] array=new int[4];
    array[0]=456;
    array[1]=543;
    array[2]=979;
    array[3]=345;
    Scanner sc=new Scanner(System.in);
    boolean flag=true;
        while(flag) {
        System.out.println("enter the array index no");
        int indexNo = sc.nextInt();
        System.out.println("enter the number you want to divide this index no of array");
        int divno=sc.nextInt();
        try {
            try {
                System.out.println("Your entire index number of arrays value is " + array[indexNo]);
                System.out.println("the result of this division is " + array[indexNo]/divno);
                flag=false;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("your entire index number of array is invalid..");
            }
        } catch (ArithmeticException e) {
            System.out.println("something went wrong...");
        }
    }
    }
}
public class handling_specific_exception {
    public static void main(String [] args){
       /* int [] marks=new int [3];
        marks[0]=28;
        marks[1]=56;
        marks[2]=4;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the arraylist number");
        int ind=sc.nextInt();
        System.out.println("enter the number you want to divide with");
        int number=sc.nextInt();
        try {
            try{ //nested try-catch block
            System.out.println("you have entire index no of arrays value is " + marks[ind]);
            System.out.println("the result of our division is " + marks[ind] / number);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("some thing wents wrong...you want to choose incorrect index no of array");
                System.out.println(e);
            }
        }
        catch (ArithmeticException e){
            System.out.println("some thing wents wrong...you want to choose incorrect index no of array");
            System.out.println(e);
        }

        catch (Exception e){
            System.out.println("some thing wants wrong...you want to choose incorrect index no of array or divisible no");
            System.out.println(e);
        }

        */
//        qick quiz : write a java program that allows you to keep accessing
//                    an array until a valid index is given by the user

        fun fn=new fun();


    }
}
