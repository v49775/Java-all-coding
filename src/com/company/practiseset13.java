package com.company;
class myt1 extends Thread{
    public myt1(String name){
        super(name);
    }
    public void run(){
        int i= 0;
        while(i<40){
            System.out.println("good morning");
            i++;
        }
    }
}
class myt2 extends Thread{
    public void run(){
        int i= 0;
        while(i<40){
            System.out.println("welcome");
//            try {
//                Thread.sleep(200);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            i++;
        }
    }
}
public class practiseset13 {
    public static void main(String []args){
//        problem1:write a program to print "good morining" and "welcome" continusly on the screen in java using threads
        myt1 t1=new myt1("vinayak");
        myt2 t2=new myt2();
        t2.setPriority(9);
        System.out.println(t2.getPriority());
//        t1.start();
//        t2.start();
        System.out.println(t2.getState());
        System.out.println(Thread.currentThread().getState());

//        problem 2: add a sleep method in welcome thread in prob 1 to dealay its execution for 200 ms

//        problem3: demonstreat getpriority and setpriority methods in java threads

//        problem 4: how do you get astate of given  thread in java

    }
}
