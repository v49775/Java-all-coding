package com.company;
class mynewthr1 extends Thread{
    public void run(){
        int i=0;
        while(true){
            System.out.println("thank you : ");
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class mynewthr2 extends Thread{
    public void run(){

        while(true){
            System.out.println("good morning : ");

        }
    }
}
public class thread_method {
    public static void main(String[] args) {
        mynewthr1 t1=new mynewthr1();
        mynewthr2 t2=new mynewthr2();
        t1.start();
        try{
            t1.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        t2.start();

    }
}
