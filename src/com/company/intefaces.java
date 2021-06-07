package com.company;
interface bicycle{
    int a=445;
    void applyBreak(int decrement);
    void speedUp(int increment);
}
interface blowHorn{
    void peee();
    void poo();
}
class AvonCycle implements bicycle,blowHorn{
    public void bllowHorn(){
        System.out.println("pee pee pee peeeeeeeee");
    }
    public void applyBreak(int decrement){
        System.out.println("applying break");
    }
    public void speedUp(int increment){
        System.out.println("appling speed");
    }
    public void peee(){
        System.out.println("pee pee pee pee");
    }
    public void poo(){
        System.out.println("poo pooo pooo poooo oo....");
    }

}
public class intefaces {
    public static void main(String[] args) {
        AvonCycle cycle=new AvonCycle();
        cycle.applyBreak(1);
        System.out.println(cycle.a);
        cycle.peee();
        cycle.poo();
    }
}
