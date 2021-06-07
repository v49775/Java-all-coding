package com.company;
/**
 * this is use to custom calcualtor
 *<p>this is my own java documentation</p>
 * @author codewithv4
 * @version 0.1
 * @since 2021
 * @see <a herf="https://docs.oracle.com/en/java/javase/14/">java docs</a>
 */
class invalidException extends Exception{
    @Override
    public String toString(){
        return "cannot add 8 & 9";
    }
    @Override
    public String getMessage(){
        return getMessage();
    }
}
class cannotdividebyzeroException extends Exception{
    @Override
    public String toString(){
        return "cannot divide by zero (0)";
    }

}
class maxinputException extends Exception {
    @Override
    public String toString() {
        return "your entire input is input id gretter then 10000";
    }
}
class maxmultiplyinputException extends Exception{
    @Override
    public String toString(){
        return "your entire input is input id gretter then 7000";
    }
}



class customCalculator{
    double add(double a,double b)throws invalidException,maxinputException{
        if (a > 10000 || b > 10000) {
            throw new maxinputException();
        }
        if(a==8 || b==9){
            throw new invalidException();
        }
        return a+b;
    }
    double sub(double a,double b)throws invalidException,maxinputException{
        if (a > 10000 || b > 10000) {
            throw new maxinputException();
        }
        if(a==8 || b==9 ){
            throw new invalidException();
        }
        return a-b;
    }
    double mult(double a,double b)throws invalidException,maxmultiplyinputException{
        if (a > 7000 || b > 7000) {
            throw new maxmultiplyinputException();
        }
        if(a==8 || b==9){
            throw new invalidException();
        }
        return a*b;
    }
    double divide(double a,double b)throws invalidException,cannotdividebyzeroException,maxinputException{
        if (a > 10000 || b > 10000) {
            throw new maxinputException();
        }
        if(a==8 || b==9){
            throw new invalidException();
        }
        else if (b==0){
            throw new cannotdividebyzeroException();
        }
        return a/b;
    }
}


public class custom_calcultor {

    public static void main(String[] args)throws invalidException,cannotdividebyzeroException,maxinputException,maxmultiplyinputException {
         /*
        You have to create a custom calculator with following operations:
        1. + -> Addition
        2. - -> Subtraction
        3. * -> Multiplication
        4. / -> Division
        which throws the following exceptions:
        1. Invalid input Exception ex: 8 & 9
        2. Cannot divide by 0 Exception
        3. Max Input Exception if any of the inputs is greater than 100000
        4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000
         */

        customCalculator cc =new customCalculator();
//        double aditon=cc.add(8,9);
//        System.out.println(aditon);
        double division=cc.divide(50,25);
        System.out.println(division);
        double multiplication=cc.mult(50000,25);
        System.out.println(multiplication);

    }
}
