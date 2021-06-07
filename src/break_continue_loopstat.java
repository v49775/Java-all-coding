public class break_continue_loopstat {
    public static void main(String[] args){

        // break statement in loop
        /*
        int i = 0;

        while(i<5){
            System.out.println(i);
            System.out.println("java is great");
            if(i==3){
                System.out.println("ending the loop");
                break;
            }
            i++;
        }
        do{
            System.out.println(i);
            System.out.println("java is great");
            if(i==3) {
                System.out.println("ending the loop");
                break;
            }
            i++;

        }while(i<5);
        */


        // continue statement in loop


        for(int i=0;i<=10;i++){
            if(i==4){
                System.out.println("ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("java is great");
        }
        int j=0;
        while(j<5){
            if(j==3){
                continue;
            }
            System.out.println(j);
        j++;
        }
    }
}
