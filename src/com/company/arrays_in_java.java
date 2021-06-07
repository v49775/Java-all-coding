package com.company;

public class arrays_in_java {
    public static void main(String []args){
        /*clssroom of 500 student- you have to store markes of these 500 student
            you have 2 options:
            1. create 500 variables
            2. use arres (recommended)

        // there are three ways to create arrays in java
        //1. diclaration and memory allocation
        // int [] markes =new int [500];
        //2. diclaration and then memory allocation
        //        int [] marks;
        //        marks=new int [5];
        //        marks[0]=10;
        int [] marks;
        marks=new int [5];
        //initilization
        marks[0]=10;
        marks[1]=30;
        marks[2]=80;
        marks[3]=60;
        marks[4]=40;
        System.out.println(marks[3]);

        // 3. declaration,memory allaction and initilization together
        int [] rno={34,45,27,4,478,48,7};
        double [] no={34.4,455.4,234.44,344.44};
        System.out.println(rno[4]);

        System.out.println(marks.length); // to check the length of array
        System.out.println(no.length);
        // displaying the arrays
        System.out.println("displaing the arrays using for loop");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        // displaying the arrays in discising order using for loop
        System.out.println("displaing the arrays in discrising using for loop");
        for (int i = marks.length-1; i >= 0; i--) {
            System.out.println(marks[i]);
        }
        //displaing the arrays using for-each loop
        System.out.println("displaing the arrays using for-each loop");
        for (int element:marks){
            System.out.println(element);
        }

        System.out.println("displaing the arrays using while loop");
        int i=0;
        while(i>=marks.length){
            System.out.println(marks[i]);
            i++;
        }


        // Multi-Dimentional Arrays
        // 2-d arrayas
        System.out.println("displaing the multi-dimentional arrays");

        int [][] flats=new int[2][3];
        flats[0][0]=101;
        flats[0][1]=102;
        flats[0][2]=103;
        flats[1][0]=201;
        flats[1][1]=202;
        flats[1][2]=203;
        System.out.println(flats.length);

        for(i=0;i<flats.length;i++){
            for(int j=0;j<flats.length;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }

         */

        String [][] subject=new String[2][3];
        subject [0][0]="vinayak";
        subject [0][1]="varad";
        subject [0][2]="abhishek";
        subject [1][0]="pranav";
        subject [1][1]="tushar";
        subject [1][2]="vijay";


        for(int i=0;i<subject.length;i++){
            for(int j=0;i<subject.length;j++){
                System.out.print(subject[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }

    }
}
