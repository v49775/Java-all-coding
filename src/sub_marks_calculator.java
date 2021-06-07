package com.company;
import java.util.Scanner;

public class sub_marks_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the total subject");
        float a=sc.nextFloat();
        System.out.println("enter the marks of subject 1: ");
        float subject1=sc.nextFloat();
        System.out.println("enter the marks of subject 2: ");
        float subject2=sc.nextFloat();
        System.out.println("enter the marks of subject 3: ");
        float subject3=sc.nextFloat();
        System.out.println("enter the marks of subject 4: ");
        float subject4=sc.nextFloat();
        System.out.println("enter the marks of subject 5: ");
        float subject5=sc.nextFloat();
        System.out.println("enter the marks of subject 6: ");
        float subject6=sc.nextFloat();
        float totalmarks=((subject1+subject2+subject3+subject4+subject5+subject6)/600.0f)*100;
        System.out.println("the total percentage is: "+ totalmarks);

    }
}
