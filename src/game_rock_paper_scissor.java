import java.util.Scanner;
import java.util.Random;
public class game_rock_paper_scissor {
    public static void main(String[] args) {

        String personPlay;
        String computerPlay = "";
        int computerInt;
        String response;

        Scanner sc=new Scanner(System.in);
        Random generator=new Random();

        System.out.println("Lets play Rock Paper Scissor!\n" +
                "Type your move\n" +
                "r=rock,s=scissor,p=paper\n");

        computerInt=generator.nextInt(3)+1;

        if (computerInt==1)
            computerPlay="R";
        else if (computerInt==2)
            computerPlay="P";
        else if (computerInt==3)
            computerPlay="S";

        int i=1;

        while (i<6){
            System.out.println("Enter your play:");

            personPlay = sc.next();
            personPlay = personPlay.toUpperCase();

            System.out.println("Computer play is:" + computerPlay);

            if (computerPlay.equals(personPlay))
                System.out.println("Its a tie\n");

            else if (personPlay.equals("R"))
                if (computerPlay.equals("S"))
                    System.out.println("Rock crushes Scissor: YOu Win!\n");
                else if (computerPlay.equals("P"))
                    System.out.println("Paper covers Rock: You Lose!\n");
                else if (personPlay.equals("P"))
                    if (computerPlay.equals("R"))
                        System.out.println("Paper covers Rock: You Win!\n");
                    else if (computerPlay.equals("S"))
                        System.out.println("Scissor cuts the Paper:You Lose!\n");
                    else if (personPlay.equals("S"))
                        if (computerPlay.equals("R"))
                            System.out.println("ROck crushes Scissor:You Lose!\n");
                        else if (computerPlay.equals("P"))
                            System.out.println("Scissor cuts Paper: You Win!\n");


            i++;
        }


    }
}

