package com.company;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class meth{
    @SuppressWarnings("Deprecation")
    public int add(int a,int b){
        return a+b;
    }
}
interface methods{
    void meth1();

}

public class advance_java_practiceset {
    public static void main(String [] args)throws Exception{
//        problem 1: create a java docs frome a java program using and without using intelij idea
//        problem 2: create a class and add a method with depricate anotation what is its effect on program execution

        meth m=new meth();
        int a=m.add(5,6);
        System.out.println(a);

//        problem 3: supress the genrated waring in problem 2
//        problem 4: create an interface and generate and instance frome it
        methods mm=()->{
            System.out.println("this is method 1");
        };
        mm.meth1();

//         problem 5: write a program to generate multiplication table of a given no and write it to file
        int a1=2;
        String table1="";
        for(int i=1;i<=10;i++){
            table1 +=a1 +" X "+i+" = "+(a1*i);
//            System.out.println(table);
            table1+="\n";
        }int a2=3;
        String table2="";
        for(int i=1;i<=10;i++){
            table2 +=a2 +" X "+i+" = "+(a2*i);
//            System.out.println(table);
            table2+="\n";
        }int a3=43;
        String table3="";
        for(int i=1;i<=10;i++){
            table3 +=a3 +" X "+i+" = "+(a3*i);
//            System.out.println(table);
            table3+="\n";
        }int a4=5;
        String table4="";
        for(int i=1;i<=10;i++){
            table4 +=a4 +" X "+i+" = "+(a4*i);
//            System.out.println(table);
            table4+="\n";
        }int a5=6;
        String table5="";
        for(int i=1;i<=10;i++){
            table5 +=a5 +" X "+i+" = "+(a5*i);
//            System.out.println(table);
            table5+="\n";
        }int a6=7;
        String table6="";
        for(int i=1;i<=10;i++){
            table6 +=a6 +" X "+i+" = "+(a6*i);
//            System.out.println(table);
            table6+="\n";
        }int a7=8;
        String table7="";
        for(int i=1;i<=10;i++){
            table7 +=a7 +" X "+i+" = "+(a7*i);
//            System.out.println(table);
            table7+="\n";
        }int a8=9;
        String table8="";
        for(int i=1;i<=10;i++){
            table8 +=a8 +" X "+i+" = "+(a8*i);
//            System.out.println(table);
            table8+="\n";
        }int a9=10;
        String table9="";
        for(int i=1;i<=10;i++){
            table9 +=a9 +" X "+i+" = "+(a9*i);
//            System.out.println(table);
            table9+="\n";
        }
//
//        FileWriter fileWriter=new FileWriter("multiplication_table.txt");
//        fileWriter.write(table);
//        fileWriter.close();

//        problem 6: repeat 5 with numbers from 2-9 and save all this multiplication table to a folder
        FileWriter fileWriter1=new FileWriter("multiplication_table.txt");
        FileWriter fileWriter2=new FileWriter("multiplication_table.txt");
        FileWriter fileWriter3=new FileWriter("multiplication_table.txt");
        FileWriter fileWriter4=new FileWriter("multiplication_table.txt");
        FileWriter fileWriter5=new FileWriter("multiplication_table.txt");
        FileWriter fileWriter6=new FileWriter("multiplication_table.txt");
        FileWriter fileWriter7=new FileWriter("multiplication_table.txt");
        FileWriter fileWriter8=new FileWriter("multiplication_table.txt");
        FileWriter fileWriter9=new FileWriter("multiplication_table.txt");
        fileWriter1.write(table1);
        fileWriter2.write(table2);
        fileWriter3.write(table3);
        fileWriter4.write(table4);
        fileWriter5.write(table5);
        fileWriter6.write(table6);
        fileWriter7.write(table7);
        fileWriter8.write(table8);
        fileWriter9.write(table9);
        fileWriter1.close();
        fileWriter2.close();
        fileWriter3.close();
        fileWriter4.close();
        fileWriter5.close();
        fileWriter6.close();
        fileWriter7.close();
        fileWriter8.close();
        fileWriter9.close();

    }
}
