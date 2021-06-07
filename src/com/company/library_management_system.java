package com.company;
import java.util.*;
public class library_management_system {
    public static void main(String[] args) {
        /*
         Create a library management system which is capable of issuing books to the students.
         Book should have info like:
         1. Book name
         2. Book Author
         3. Issued to
         4. Issued on
         User should be able to add books, return issued books, issue books
         Assume that all the users are registered with their names in the central database
          */
        ArrayList <String> bname=new ArrayList<>();
        bname.add("java");
        bname.add("python");
        bname.add("c++");
        System.out.println("the books names are present in labrary is");
        System.out.println(bname);

    }
}
