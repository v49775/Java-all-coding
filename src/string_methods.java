package com.company;

public class string_methods {
    public static void main(String[] args) {
        String name = "Vinayak";
        System.out.println(name);

   //Method 1 : calculate length
        int value = name.length();
        System.out.println(value);

   //method 2 : convert lowercase
        String lstring = name.toLowerCase();
        System.out.println(lstring);

   //method 3 :convert upper case
        String ustring = name.toUpperCase();
        System.out.println(ustring);

   //method 4 : trim()- return a new string after removing all the leading and the treding "space" from the original string
        String nontrim = "        vinayak shgh     ";
        System.out.println(nontrim);
        System.out.println(nontrim.trim());

   //method 5 : substring(int start)-return a substring from start to end, like a string name = vinayak, substring(5) returns "ak"
        System.out.println(name.substring(5));
        System.out.println(name.substring(3));
        System.out.println(name.substring(0));  // return the same string

   //method 6 : substring(int start,int end)-return a substring from start index to end index, stat index included and end index is excluded
        // like a string name = vinayak, substring(3,5) returns "ay"
        System.out.println(name.substring(3,5));

   //method 7 : replace(char,char) & replace(string,string)
        System.out.println(name.replace('a','e'));
        System.out.println(name.replace("yak","var"));
        System.out.println(name.replace("y","evar"));


    //method 8 :startsWith("write a starting charactor is return boolian value")
              //endsWith("write a ending charactor name is return boolian value")
        System.out.println(name.startsWith("vin"));
        System.out.println(name.startsWith("Vin"));
        System.out.println(name.endsWith("yak"));
        System.out.println(name.endsWith("iak"));

   //method 9:charAt(write a index no of a string)
        System.out.println(name.charAt(0));

   // method 10:indexOf(str) it returns the index no of string
             // lastIndexOf(str,last index no) it returns the index no of last side string
        String modifidename="vinayakyak";
        System.out.println(modifidename.indexOf("y"));
        System.out.println(modifidename.indexOf("a"));
        System.out.println(modifidename.lastIndexOf("ak",6));

    //method 11:equals(str) it return true if the gues string is equal to the orignal string
            // equalsIgnorCase(str) it return true if the gues string is equal to the orignal string but the string is upper or lower case you have to change the string
        System.out.println(name.equals("Vinayak"));
        System.out.println(modifidename.equals("vinayakyak"));
        System.out.println(modifidename.equals("vinayakyakyak")); //it returns a false because the string name is not equal to the orignal string name.
        System.out.println(name.equalsIgnoreCase("vinaYak")); // it returns true because the in this function the upper or lower case is not mandatory


    // escape sequence charactors
    // eg:(\n=newline; \t=insert yab; \b=backspace; \r=carriage return; \'=single quote; \"=double quote; \\=backslash)
        System.out.println("hey hii vard \n where are you");
        System.out.println("hey hii vard \t where are you");
        System.out.println("hey hii vard\b where are you");
        System.out.println("hey hii vard \r where are you");
        System.out.println("hey hii \'vard\' where are you");
        System.out.println("hey hii \"vard\" where are you");
        System.out.println("hey hii vard \\ where are you");



    }
}
