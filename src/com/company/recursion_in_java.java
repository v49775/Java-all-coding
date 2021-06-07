package com.company;

public class recursion_in_java {
    // Recursion = a function in java can call itself. such calling of fun by itself is called Recursion
    static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        else{
            //return n * factorial(n-1);
            int product=1;
            for(int i=1;i<=n;i++){
                product *= i;
            }
            return product;
        }
    }

    public static void main(String[] args) {
        int x=5;
        System.out.println(factorial(x));

    }
}
