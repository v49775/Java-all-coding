package com.company;
class A{
    public void meth1(){
        System.out.println("i am a method 1 of class A");
    }
    public void meth2(){
        System.out.println("i am method 2 of class A");
    }
}
class B extends A{
    @Override
    public void meth2(){
        System.out.println("i am method 2 of class B");
//        super.meth2();
    }
}
public class method_overriding {
    private A a;

    public static void main(String[] args){
        A a= new A();
        B b= new B();

        a.meth2();
        b.meth2();
    }

}
