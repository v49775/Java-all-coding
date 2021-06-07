package com.company;
class negativeException extends Exception{
    public String grtMessage(){
        return "radius cannot be negative";
    }
    public String toString(){
        return "radius cannot be negative";
    }


}
public class throw_and_throws_excwption {
   public static double area(int r) throws negativeException{
        if(r<0){
            throw new negativeException();
        }
        double result=Math.PI*r*r;
        return result;
    }
    public static int divide(int a,int b) throws ArithmeticException{
        int result=a/b;
        return result;
    }


    public static void main(String[] args) {
        try{
//            int c=divide(8,2);
//            System.out.println(c);
            double c=area(6);
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println(e);
//            System.out.println(e.getMessage());
        }
    }
}
