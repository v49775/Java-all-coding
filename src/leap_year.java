import java.util.*;
public class leap_year {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while(i<4) {
            System.out.println("enter the year");
            int year = sc.nextInt();

                if (year % 4 == 0) {
                    System.out.println(year + " is a leap year");
                }
                else {
                    System.out.println(year + " is not leap year");
                }
            i++;
        }
    }
}
