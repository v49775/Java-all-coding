package com.company;

public class method_overloading {
    static void foo(){
        System.out.println("goood morning broo !");
    }
    static void foo(String a , int b){
        System.out.println("good morning"+a+"broo!");
        System.out.println("your no is "+b+" broo!");
    }



    static void telljoke(){
        System.out.println("You probably know some good jokes. So do we. I, Mr. Orlando, with the help of my good \n" +
                              "friend Cottonball, am here to tell you some of my favourite jokes. \n"+
                              "Try these out on your friends and family");
    }
    static void change(int a){
        a=98;
    }
    static void change2(int [] arr){
        arr[0]=98;
    }
    public static void main(String[] args){
        //telljoke();
        //int x= 52;
        //int y=change(x);
        //System.out.println(y);

        // case 2: change the array
        //int [] marks= {75,76,96,75,78};
        //change2(marks);
        //System.out.println(marks[0]);


        // now start the  METHOD OVERLOADING ...
        foo();
        foo(" abhi ",40);

    }
}
