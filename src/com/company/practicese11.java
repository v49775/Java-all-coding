package com.company;
abstract class pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends pen{
    public void write(){
        System.out.println("write");
    }
    public void refill(){
        System.out.println("refill");
    }
    public void changeNib(){
        System.out.println("changing the Nib");
    }

}

class monkey{
    public void jump(){
        System.out.println("jumping");
    }
    public void bite(){
        System.out.println("biting");
    }
}
interface Basicanimal{
    void eat();
    void sleep();
}
class human extends monkey implements Basicanimal{
    public void speak(){
    System.out.println("speaking.....");
    }
    public void eat(){
        System.out.println("eating.....");
    }
    public void sleep(){
        System.out.println("sleeping.....");
    }
}
abstract class telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class smarttelephone extends telephone{
    public void ring(){
        System.out.println("ringing........");
    }
    public void lift(){
        System.out.println("lift the telephone");
    }
    public void disconnect(){
        System.out.println("disconnect the telephone");
    }
}

interface TVRemote{
    void clicknextButten();
    void clickBackButten();
}
interface SmartRemote {
    void dielChannelNo();
}
class remote implements TVRemote,SmartRemote{
    public void clicknextButten(){
        System.out.println("click to next butten");
    }
    public void clickBackButten(){
        System.out.println("cick to back butten");
    }
    public void dielChannelNo(){
        System.out.println("directly diling channel no");
    }
}
class Tv extends remote implements TVRemote{
    public void watchMovies(){
        System.out.println("watching a movie");
    }

}

public class practicese11 {
    public static void main(String[] args) {
//        problem 1:create an abstract class Pen method write() and refill() as abstract method
//         problem 2: use a pen class from que 1 to create a concreat class FountainPen with additional method changeNib()
        FountainPen fp = new FountainPen();
        fp.changeNib();
        fp.refill();
/*
        problem 3: create a class monkey with jump() and bite() methods.
        create a class human a which inherits this monkey class and implements Basic animal interface
        with eat() and sleep() method.
 */
        human h = new human();
        h.eat();
        h.sleep();
        h.speak();

//        PROblem 4: Demonstriate polimorphism using monkey class que3
        monkey m=new human();
        m.jump();

//        problem 5: create a class telephone with ring() , lift(), and disconnect() method as
//        abstract method create a another classs smarttelephone and demonstrate polymorphiosm

        telephone tl=new smarttelephone();
        tl.ring();


//        problem 6:create an interface TVremote and use it to another interface smartremote
        TVRemote tv=new remote();
        tv.clickBackButten();
        SmartRemote sr=new remote();
        sr.dielChannelNo();

//        problem 7:create class tv which implements tvremote interface with que 6
        TVRemote tt=new Tv();
        tt.clicknextButten();


    }
}
