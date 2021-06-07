import java.util.Random;
import java.util.Scanner;

public class practieset5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int computerplay;
        int playerplay;

        System.out.println("play the new game \n"+"rock_paper_scissor \n");
        System.out.println("you can try this number according to your moves \n" + "Rock = 1, Scissor = 2, Paper = 3 \n"
                +"you want to play first moves");

        int i=1;
        while(i<6){
            computerplay = rd.nextInt(3)+1;
            playerplay = sc.nextInt();

            System.out.println("player can play " + playerplay);
            System.out.println("computer can play " + computerplay);


            if (playerplay == computerplay) {
                System.out.println("you and computer both are same");
            } else if (playerplay == 1) {
                if (computerplay == 2) {
                    System.out.println("Rock crushed the Scissor\n" + "You are Win!!!");
                } else if (computerplay == 3) {
                    System.out.println("paper cover the rock\n" + "computer is a Win!!! \n" + "you are loss!!!");
                }
            } else if (playerplay == 2) {
                if (computerplay == 1) {
                    System.out.println("Rock crushed the Scissor\n" + "computer is a win\n" + "You are loss!!!");
                } else if (computerplay == 3) {
                    System.out.println("Scissor cuts the paper\n" + "computer is a Win!!!");
                }
            } else if (playerplay == 3) {
                if (computerplay == 1) {
                    System.out.println("paper cover the rock\n" + "You are Win!!!");
                } else if (computerplay == 2) {
                    System.out.println("Scissor cuts the paper\n" + "you are loss \n" + "computer is a Win!!!");
                }
            } else {
                System.out.println("Error\n" + "plese choose the Apropreate number 1 or 2 or 3");
            }
            i++;
        }


    }
}