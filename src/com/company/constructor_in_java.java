package com.company;

class mymainemployee{
    private int id;
    private String name;

    public mymainemployee(){  // adding a counstructor . it is a constructor
        id=33;
        name="your-name-here";

     }

    public mymainemployee(int salary) {  // adding a counstructor . it is a constructor
        id = salary;
        name = "your-name-here";
    }

    public mymainemployee(String myname,int myid){  // adding a counstructor
        id=myid;
        name=myname;
    }

    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
    public void setId(int n){
        id=n;
    }
    public int getId(){
        return id;
    }

}

public class constructor_in_java {

    public static void main(String [] args){
        //mymainemployee vk = new mymainemployee("code with v4",10);
        mymainemployee vk = new mymainemployee(50000);
//        vk.setId(55);
//        vk.setName("code_with_v4");
        System.out.println("my salary is "+vk.getId());
        System.out.println(vk.getName());
    }

}
