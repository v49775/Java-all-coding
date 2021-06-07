package com.company;
import java.util.Random;
import java.util.Scanner;

class guessesTheNumber{
    private int computerplay;
    private int userplay;
    public guessesTheNumber(int cplay, int uplay){
        computerplay=cplay;
        userplay=uplay;
    }
    public void setComputerplay(int computerplay){
        this.computerplay=computerplay;
    }
    public int getComputerplay(){
        return computerplay;
    }
    Scanner sd=new Scanner(System.in);
    int u=sd.nextInt();
    public int setuserplay(){
        this.userplay=u;
        return u;
    }
    public int getuserplay(){
        return userplay;
    }



}

public class gusses_the_number {
    public static void main(String [] args){
        /* create class game , which allows to user to play " gusses the number " game once
           game should have the following methods:
           1.constructor to the genarate random number
           2.takeUserInput() to take user input of number
           3. isCorrectNumber() to detect whether the number entered by user is true
           4. getter and setter for noOfgusses()
           use properties such as noOfguesses(int) , etc t get this task is done!!!

         */
        Random noGenrator = new Random();
        Scanner sc= new Scanner(System.in);

        guessesTheNumber gtr=new guessesTheNumber(noGenrator.nextInt(100),sc.nextInt());
        int h=gtr.getComputerplay();
        int g = gtr.setuserplay();
//        System.out.println(gtr.getuserplay());


            System.out.println(g);
            if (h == g) {
                if (h == g) {
                    System.out.println("yes you win you gusses the no");
                } else if (g < h) {
                    System.out.println("try again your no is smaller than gussing no");
                }
                else if(g>h){
                    System.out.println("try again your entire no is gretter than gussing no");
                }
            }
            else if (g < h) {
                if (g < h) {
                    System.out.println("try again your no is smaller than gussing no");
                } else if (g > h) {
                    System.out.println("try again your entire no is gretter than gussing no");
                }
            }
            else {
                System.out.println("try again your entire no is gretter than gussing no");
            }





//
//        System.out.println(g);
//        gtr.setComputerplay(noGenrator.nextInt(100));
////        System.out.println(gtr.getComputerplay());
//
//


    }
}