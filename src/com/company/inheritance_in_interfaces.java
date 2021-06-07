package com.company;
interface Sampleclass{
    void meth1();
    void meth2();
}
interface mySampleclassinterface extends Sampleclass{
    void meth3();
    void meth4();
}
class mychild implements mySampleclassinterface{
    public void meth1(){
        System.out.println("method 1");
    }
    public void meth2(){
        System.out.println("method 2");
    }
    public void meth3(){
        System.out.println("method 3");
    }
    public void meth4(){
        System.out.println("method 4");
    }

}
public class inheritance_in_interfaces {
    public static void main(String [] args){
        mychild ch = new mychild();
        ch.meth1();
        ch.meth2();
        ch.meth3();
        ch.meth4();
    }
}
