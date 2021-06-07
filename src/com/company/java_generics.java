package com.company;

import java.util.ArrayList;
class mygenric<T1,T2>{
    int val=543;
    private T1 t1;
    private T2 t2;

    public mygenric(int val ,T1 t1,T2 t2) {
        this.val=val;
        this.t1 = t1;
        this.t2 = t2;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}
public class java_generics {
    public static void main(String[] args) {
//        ArrayList<Integer> arrayList=new ArrayList();
////        ArrayList arrayList=new ArrayList();
////        arrayList.add("string");
//        arrayList.add(5456);
//        arrayList.add(564);
////        int a=(int)arrayList.get(2);
//        int a=arrayList.get(1);
//        System.out.println(a);

        mygenric gn=new mygenric(25,"this is my class",54);
        System.out.println(gn.getVal());
        System.out.println(gn.getT2());


    }
}
