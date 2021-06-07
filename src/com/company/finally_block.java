package com.company;

public class finally_block {

    public static void main(String[] args) {
//        try{
//            int a=45;
//
//            int b=2;
//            int c=a/b;
//            System.out.println(c);
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
//        finally {
//            System.out.println("this is end of function");
//        }

        int a=9;
        int b=8;
        while (true){

        try{
            System.out.println("the result is "+ a/b);

        }
        catch(Exception e){
            System.out.println(e);
            break;
        }
        finally{
            System.out.println("the value of b is " + b);
        }
        b--;
        }
    }
}
