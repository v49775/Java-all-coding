public class practiceset3 {
    public static void main(String[] args) {
    //Quation 1:write a java program to convert a string to lowercase
        String myname = "VinAYak wagh";
        String name = myname.toLowerCase();
        System.out.println(name);
        System.out.println(myname.toLowerCase());
        System.out.println(myname.toUpperCase());

    //quation 2:write a java programme to replace spaces with underscore
        String text = "thi is vinayak";
        text=text.replace(" ","_");
        System.out.println(text);
        System.out.println(myname.replace(" ","_"));

    //Quation 3:write a java programe to fill in a letter template which looks like bellow
    /*
    letter = "Dear <|name|> thanks a lot"
    Replace <|name|> with a string (some name)
     */
        String letter = "Dear <|name|> , thanks a lot";
        letter = letter.replace("<|name|>","vinayak");
        System.out.println(letter);

    //Quation 4:write a java programe to detect double and triple spaces in a string
        String spaces = "this  is the   java program";
        System.out.println("double space : " + spaces.indexOf("  "));
        System.out.println("Triple space : " + spaces.indexOf("   "));

    // Quation 5:write a java program to format a following letter using escape sequence charactor
    /*
    letter2 = "dear vinayak, this java course is nice thanks"
     */
        String myletter = "dear \'vinayak\',\n\tThis java course is nice.\n\tThanks";
        System.out.println(myletter);



    }
}
