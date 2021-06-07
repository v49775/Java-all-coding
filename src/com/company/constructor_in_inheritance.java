package com.company;
class Base1{
    Base1(){
        System.out.println("i am a constructor of base class");
    }
    Base1(int x){
        System.out.println("i am a overloaded constructor of base class with x: " + x);
    }
}
class Derived1 extends Base1{
    Derived1(){
        System.out.println("i am a constructor of derived class");
    }
    Derived1(int x,int y){
        super(x);
        System.out.println("i am a overloaded constructor of derived class with Y: " + y);
    }
}
class childderived extends Derived1{
    childderived(){
        System.out.println("i am a constructor of derived class");
    }
    childderived(int x,int y,int z){
        super(x,y);
        System.out.println("i am a overloaded constructor of child derived class with z: "+z);
    }
}
public class constructor_in_inheritance {
    public static void main(String[] args){
//        Base1 d1=new Base1();
//        Derived1 d1=new Derived1();
        childderived d1=new childderived(56,55,8);
    }
}
