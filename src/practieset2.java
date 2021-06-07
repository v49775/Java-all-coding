package com.company;
import java.util.Scanner;

public class practieset2 {
    public static void main(String[] args) {

//      Quetion1 : what will the result of following expression: float a = 7/4 * 9/2
        float a =7/4.0f * 9/2.0f;
        float b =45/89.0f * 98/2.0f + (67.0f);
        System.out.println(a);
        System.out.println(b);

//      Quetion2 : write a java program to encript a grade by adding 8 to it show the corect grade
        char grade = 'B';
        grade=(char)(grade + 8);
        System.out.println(grade);

        //dicription the grade
        grade=(char)(grade - 8);
        System.out.println(grade);

//      Quation3 : write a java program , We use comparission oprator to find a given number is grettor than the user entered number or not.
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number for you can check the number is gretter or not: ");
        int l = sc.nextInt();
        System.out.println(l>8);


//      Quation4 : write a following expression in a java program : (v^2 - u^2)/2as
        int v = 2;
        int u = 4;
        int a1 = 5;
        int s = 6;
        float expression = ((v*v) - (u*u))/2*a1*s;
        System.out.println(expression);

//      Quation5 : find the value of the following expression : x = 7,a = 7*49/7 + 35/7
        int x = 7;
        int a2 = x*49/7 + 35/7;
        System.out.println(a2);


    }
}
