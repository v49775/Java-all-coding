package com.company;
import java.util.Scanner;

public class practiceset7 {
    public static void main(String []args){
        //quation 1: craete an array of 5 float and calculate there sums
       /* float [] array={10.7f,34.5f,65.4f,97.4f,67.4f};
        float sum=0;
        for(float element:array){
            sum=element+sum;
        }
        System.out.println("the sum of there array is "+ sum);




        // Quation 2: write a program to find out whether a given integer is present in an array or not
        System.out.println("Enter the integer no whether a given integer is present in an array or not");
        Scanner sc=new Scanner(System.in);
        float [] array={10.7f,34.5f,65.4f,97.4f,67.4f};
        float num=sc.nextFloat();
        Boolean isinarray=false;
        for(float element:array){
            if(num==element){
                isinarray=true;
                break;
            }

        }
        if(isinarray){
            System.out.println("the given integer number is present in array " + num);
        }
        else{
            System.out.println("the given integer number is not present in array");

        }

        // Quation 3: calculate average marks from array contaning marks of all student in physics using for each loop
        Scanner sc=new Scanner(System.in);
        //int []marks={87,78,92,87,84,78,91};
        int [] marks=new int[5];
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        marks[3]=sc.nextInt();
        marks[4]=sc.nextInt();

        int sum=0;
        for(int element:marks){
            sum=sum+element;
        }
        System.out.println("the value of average marks is "+ sum/marks.length);

        //Quation 4: create a java program to add two matrix of size 2x3
        int [][] matrix1={{1,2,3},{4,5,6}};
        int [][] matrix2={{7,8,9},{6,2,8}};
        int [][] result={{0,0,0},{0,0,0}};
        for(int i = 0;i < matrix1.length;i++){
            for(int j = 0;j < matrix1[i].length;j++){
                System.out.format("setting value of i= %d and j = %d \n",i,j);
                result [i][j]=matrix1[i][j] + matrix2[i][j];
            }
            System.out.println("");
        }
        for(int i = 0;i < matrix1.length;i++){
            for(int j = 0;j < matrix1[i].length;j++){
                System.out.print(result[i][j]+"  ");
                result [i][j]=matrix1[i][j] + matrix2[i][j];
            }
            System.out.println("");
        }



        // Quation 5: write a java program to reverse an array
        int [] arr={1,2,3,4,5,6,7,8,9};
        int l= arr.length;
        int n= Math.floorDiv(l,2);
        int temp;
        for(int i=0;i<n;i++){
            //swap arr[i] and arr[l-i-1]
            // a    b   temp
            // |3| |4|  | |
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        for(int element:arr){
            System.out.print(element + " ");
        }


        // Quation 6: write a java program to find maximun element in array
        int [] array={1,2,3,433,5,6,743,8,-1119};
        int max=0;
        for(int e:array){
            if(e>max){
                max=e;

            }
        }
        System.out.println("the maximum element in this arrray is "+ max);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);



        //Quation 7: write a java program to find minimun element in array
        int [] array={1,2,3,433,5,6,-7430,8,-1119};
        int min=0;
        for(int e:array){
            if(e<min){
                min=e;

            }
        }
        System.out.println("the maximum element in this arrray is "+ min);

        */


        // Quation 8: write a java program to find whether an array is sorted or not
       // int [] array={1,2,3,433,5,6,-7430,8,-1119};
        int [] array={1,2,3,4,5,6,7,8,9};
        Boolean isSorted=true;
        for(int i=0;i<array.length-1;i++){
            if(array[i]>array[i+1]){
                    isSorted=false;
                    break;
            }

        }
        if(isSorted){
            System.out.println("the given array is sorted");
        }
        else{
            System.out.println("the given array is not sorted");

        }

    }
}
