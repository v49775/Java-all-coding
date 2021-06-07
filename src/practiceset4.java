import javax.xml.transform.stax.StAXResult;
import java.util.Scanner;
public class practiceset4 {
    public static void main(String[] args) {
       /* quation 1: what will be output of this program
        int a=10;
        if (a=11)  // = is asigment oprator you can use ==
        {
            System.out.println("i am 11");
        }
        else
        {
            System.out.println("i am not 11");
        }

      //  quation 2: write  program to find out whether a student is pass or fail; if it is require total 40%
       //              and at least 33% in each subject to pass. assum 3 subject and take marks as a input from the user
        byte m1,m2,m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your mark in physics");
        m1=sc.nextByte();
        System.out.println("Enter your mark in chemistry");
        m2=sc.nextByte();
        System.out.println("Enter your mark in math");
        m3=sc.nextByte();
        float avg=(m1+m2+m3)/3.0f;
        System.out.println("your total marks " + avg);
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("Congratulation,you are pass");
        }
        else{
            System.out.println("sory,you are fail");
        }

        //quation 3 : calculate income tax paid by an employee to the government as per the slaves mentaion below;
                 //   income   slaves     tax
                 //    2.5l  -  5.0l       5%
                 //    5.0   -  10.0l      20%
                 //    aboue    10.0l      30%

        Scanner sc = new Scanner(System.in);
        float tax = 0;
        float income = sc.nextFloat();
        if (income<=2.5){
            tax = tax + 0;
        }
        else if (income > 2.5f && income <= 5.0f){
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if (income > 0.5f && income <= 10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5.0f);
        }
        else if (income > 10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5.0f);
            tax = tax + 0.3f * (income - 10.0f);
        }
        System.out.println("the total paid tax to employee is : " + tax);


        //quation 4: write a java program to find out the day of the week given the number [1 for monday , 2 for tuesday , ... and so on !]
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch(day){
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thirsday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("sunday");

        }*/

        // quation 5: write a java program to find whether a year enter by the user is leap year or not
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year%4==0){
            System.out.println("yes it is a leap year");
        }
        else {
            System.out.println("it is not leep year");
        }



    }
}
