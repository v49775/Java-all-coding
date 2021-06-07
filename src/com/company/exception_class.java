package com.company;
import java.util.Scanner;
class myexception extends Exception{
    @Override
    public String getMessage(){
        return "i am getMessage()";
    }
    @Override
    public String toString(){
        return "i am toString()";
    }

}
public class exception_class {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if(a<9){
            try{
                throw new myexception();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
            }

        }

    }
}
