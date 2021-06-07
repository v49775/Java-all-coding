package com.company;
class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while(i<20){
            System.out.println("good morning.....");
            i++;
        }
    }
}

public class constructors_in_threads {
    public static void main(String [] args){
        MyThr t1=new MyThr("Vinayak");
        MyThr t2=new MyThr("Varad");
        t1.start();
        t2.start();
        System.out.println("the name of thread ID is "+ t1.getId());
        System.out.println("the name of thread is "+ t1.getName());
        System.out.println("the name of thread ID is "+ t2.getId());
        System.out.println("the name of thread is "+ t2.getName());
        System.out.println("the state of thread is "+ t2.getState());
    }
}
