package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileHandling_in_java {
    public static void main(String[] args)throws Exception {
  /*
//        creating a new file
        File myflie=new File("cwhv4.txt");
        try{
            myflie.createNewFile();
        }
        catch (Exception e){
            System.out.println(e);
        }

//      writing the info in this file
        FileWriter fileWriter=new FileWriter("cwv4.txt");
        fileWriter.write("this is my first file in java\nOkey now by");
        fileWriter.close();
*/

//      showaing the containt of this file
        File myfile=new File("cwv4.txt");
        Scanner sc=new Scanner(myfile);
        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
/*
//        showaing the containt of this file
        File myfile = new File("javainfo.txt");
        try {

            Scanner sc = new Scanner(myfile);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

        }
        catch(FileNotFoundException e){
                System.out.println(e);
        }

//        dileting the file
        File myfile=new File("cwhv4.txt");
        if(myfile.delete()){
            System.out.println("deleted this file" + myfile.getName());
        }
        else{
            System.out.println("some error occured from this deleting process");
        }
   */
        
    }

}
