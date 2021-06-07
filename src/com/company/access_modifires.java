package com.company;
class c1{
    public int x=4;
    protected int y=45;
    int z=442;
    private int a=6;
}
public class access_modifires {
    public static void main(String []args){
        c1 c = new c1();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
//        System.out.println(c.a);

    }

}
