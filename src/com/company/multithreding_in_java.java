package com.company;
class MyThred1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<100){
        System.out.println("i am thread 1");
        System.out.println("i have cooking");
        i++;
    }
    }
}
class MyThred2 extends Thread{
    @Override
    public void run(){
        int i=0;
    while(i<100){
        System.out.println("i am thread 2");
        System.out.println("i am chatting her on wp");
        i++;
    }
    }
}
public class multithreding_in_java {
    public static void main(String[] args){
        MyThred1 t1=new MyThred1();
        MyThred2 t2=new MyThred2();
        t1.start();
        t2.start();
    }
}
