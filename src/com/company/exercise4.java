package com.company;
class circle{
    public int radius;
    circle(int r){
        System.out.println("i am circle parameterised constructor");
        this.radius=r;
    }
    public double area(){
        return Math.PI * this.radius*this.radius;
    }
}
class cylender2 extends circle{
    public int height;
    cylender2(int r,int h){
        super(r);
        System.out.println("i am circle parameterised constructor");
        this.height=h;
    }
    public double volume(){
        return Math.PI * this.radius*this.radius*this.height;

    }
}

class rectangle2{
    public int length;
    public int breadth;
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public rectangle2(int l, int b) {
        System.out.println("i am a rectangle parameterised constructor");
        this.length=l;
        this.breadth=b;
    }

    public int area(){
        return this.length*this.breadth;
    }
}
class cuboid extends rectangle2{
    public int height;
    cuboid(int l,int b,int h){
        super(l,b);
        this.height=h;
        System.out.println("i am a cuboid parameterised constructor");
    }
    public int surfaceArea(int l,int b,int h){
        this.height=h;
        return 2*l*b+2*l*h+2*h*b;
    }
    public int volume(int l,int b,int h){
        this.height=h;
        return l*b*h;
    }
}
public class exercise4 {
    public static void main(String[] args) {
//        problem 1: create class circle and use inheritance to create a another class cylender form it.
//        circle cir=new circle(12);
//        cylender2 cyl= new cylender2(12,32);

//        problem 2: create a class rectangle and use inheritance to create a another class cuboid.
//                   try to real it as close to real world as possible.
        cuboid cu=new cuboid(12,45,32);
        int volume=cu.volume(10,5,6);
        System.out.println(cu.surfaceArea(10,5,6));
        System.out.println(volume);

    }

}
