package com.company;
interface mycamera{
    void takesnap();
    void takevideo();
    default void taking4kvideo(){
        System.out.println("taking a 4k videos");
    }

}
interface mywifi{
    String [] getNetworks();
    void connectToNetworks(String network);
}
class cellphone{
    void callnumber(int phonenumber){
        System.out.println("calling "+phonenumber);
    }
    void pickcall(){
        System.out.println("connecting");
    }
}
class mysmartphone extends cellphone implements mycamera,mywifi{
    public void takesnap(){
        System.out.println("taking snap");
    }
    public void takevideo(){
        System.out.println("taking video");
    }
    public String[] getNetworks(){
        System.out.println("taking list of network");
        String[] networklist = {"vinayak","varad","dhananjay"};
        return networklist;
    }
    public void connectToNetworks(String network){
        System.out.println("connecting to ... "+network);
    }
}
public class interfaces_default_method {
    public static void main(String[] args) {
        mysmartphone sm = new mysmartphone();
        sm.takesnap();
        sm.takevideo();
        System.out.println(   );
        String[] ar = sm.getNetworks();
        for (String item:ar) {
            System.out.println(item);
        }
        sm.connectToNetworks(" vinayak");
        sm.callnumber(705780784);
        sm.pickcall();
        sm.taking4kvideo();
    }
}
