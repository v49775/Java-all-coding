package com.company;
abstract class parent{
    public parent(){
        System.out.println("i am constructor of parent class");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class child extends parent{
    @Override
    public void greet(){
        System.out.println("good morning");
    }@Override
    public void greet2(){
        System.out.println("good afternoon");
    }
}
abstract class child3 extends parent{
    public void th(){
        System.out.println("i am good");
    }
        }


public class abstract_classes {
    public static void main(String[] args) {
        child c=new child();
//        parent p=new parent();----Error, you cannot use this object because it is an abstract class.
//        child3 p=new child3();----Error, you cannot use this object because it is an abstract class.


    }
}
