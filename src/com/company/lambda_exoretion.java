package com.company;
@FunctionalInterface
interface lambada{
    void meth1();
//    void meth2();
}

public class lambda_exoretion {
    public static void main(String[] args) {
        lambada obj=()->{
            System.out.println("i am metheod 1");
        };
        obj.meth1();

    }

}
