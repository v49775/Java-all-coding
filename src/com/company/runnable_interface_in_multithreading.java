package com.company;
class MythreadRunnnable1 implements Runnable{
    public void run(){
        int i=0;
        while(i<20){
            System.out.println("i have trigger a bullet");
            i++;
        }
    }
}
class MythreadRunnnable2 implements Runnable{
    public void run(){
        int i=0;
        while(i<20){
            System.out.println("i have fire a gun dishkyav........");
            i++;
        }
    }
}

public class runnable_interface_in_multithreading {
    public static void main(String[] args) {
        MythreadRunnnable1 bullet1=new MythreadRunnnable1();
        Thread gun1=new Thread(bullet1);
        MythreadRunnnable2 bullet2=new MythreadRunnnable2();
        Thread gun2=new Thread(bullet2);

        gun1.start();
        gun2.start();


    }
}
