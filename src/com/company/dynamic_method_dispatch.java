package com.company;
class phone {
    public void name() {
        System.out.println("turning on phone.....");
    }
    public void greet(){
        System.out.println("good morning.....");
    }
}
class smartphone extends phone{
    public void name(){
        System.out.println("turning on smartphone......");
    }
}
public class dynamic_method_dispatch {
    public static void main(String []args){
        phone sm= new smartphone();// it is a dynamic method dispatch...it is allowed
        sm.name();
        sm.greet();
    }
}
