package com.company;

public class methods_in_array {
    static int logic(int x,int y) { // you can use static keyword because main static class can be ue only static word or you can create a object of this class
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return z;
    }

    public static void main(String [] args){
        int a=5;
        int b=10;
        methods_in_array obj = new methods_in_array();
        int c;
        c=logic(a,b);
        //c=obj.logic(a,b);
        int a1=51;
        int b1=20;
        int c1;
        c1=logic(a1,b1);
        //c1=obj.logic(a1,b1);

        System.out.println(c);
        System.out.println(c1);
    }
}
