package com.company;

class base{
    int x;
    public void setX(int x){
        System.out.println("I am a base class and setting a x");
        this.x=x;
    }

    public int getX() {
        return x;
    }
}
class derived extends base{
    int y;
    public void setY(int y) {
        System.out.println("i am derived class");
        this.y = y;
    }
    public int getY() {
        return y;
    }
}

class Animal{
    public int leg;
    public String sound;
    public String tel;

    public void setLeg(int leg){
        this.leg=leg;
    }
    public void setSound(String sound){
        this.sound=sound;
    }
    public void setTel(String tel){
        this.tel=tel;
    }
    public int getLeg(){
        return leg;
    }
    public String getSound(){
        return sound;
    }
    public String getTel(){
        return tel;
    }
}

class Dog extends Animal {
    public int eyes;
    public String handes;

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public String getHandes() {
        return handes;
    }

    public void setHandes(String handes) {
        this.handes = handes;
    }
}

public class inheritance {
    public static void main(String[] args) {
//        base b= new base();
//        derived d= new derived();
//
//        d.setX(55);
//        System.out.println(d.getX());
//        System.out.println(" ");
//        d.setY(66);
//        System.out.println(d.getY());

//        quig: create class animal and derived a another class dog
        Dog dog=new Dog();
        dog.setLeg(4);
        System.out.println("dog has a " + dog.getLeg() + " leg");
        dog.setSound("Bhaw bhaw bhaw bhaw");
        System.out.println("dog has a "+ dog.getSound() + " Sound");
        dog.setHandes("the dog has a no hands");
        System.out.println(dog.getHandes());
        dog.setEyes(2);
        System.out.println("the dog has a "+dog.getEyes()+" Eyes");
        dog.setTel("the dog tel is long ring in shape ");
        System.out.println(dog.getTel());


    }
}



