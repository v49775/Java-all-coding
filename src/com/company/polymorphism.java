package com.company;
interface camera{
    void takepic();
}
interface gps{
    void map();
}
class mycellPhone {
    public void takecall(){
        System.out.println("taking a call");
    }
    public void connecttonumber(){
        System.out.println("connecting to a call");
    }
}
class mysmartphone2 extends mycellPhone implements camera,gps{
    public void takepic(){
        System.out.println("taking a picture");
    }
    public void map(){
        System.out.println("checking location");
    }
}
public class polymorphism {
    public static void main(String [] args){
        gps g=new mysmartphone2();
        camera cam=new mysmartphone2();
        mysmartphone2 ms=new mysmartphone2();
        g.map();
        cam.takepic();
        ms.connecttonumber();
        ms.map();
        ms.takepic();

    }
}
