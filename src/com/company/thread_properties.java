package com.company;
class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while(i<50){
            System.out.println("good morning"+this.getName());
            i++;
        }
    }
}
public class thread_properties {
    public static void main(String[] args) {
        MyThr1 t1=new MyThr1("vinayak1");
        MyThr1 t2=new MyThr1("vinayak2");
        MyThr1 t3=new MyThr1("vinayak3");
        MyThr1 t4=new MyThr1("vinayak4");
        MyThr1 t5=new MyThr1("vinayak5 (most important)");
        t1.setPriority(Thread.NORM_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
