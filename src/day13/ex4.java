package day13;

public class ex4 {
    public static void main(String[] args) {

        /*
         Remove all spaces at the beginning and at the ending of a given string.
         If there are more than one space between words, decrease them to one space
         */

        String text = "    lfjgf         gjfjkgf      odfk    fdkofkds       ";

        text = text.trim();

        String result="";

        for (int i = 0; i < text.length()-1; i++) {

            if (!(text.charAt(i) == ' ' && text.charAt(i + 1) ==' ')) {

                result+=text.charAt(i);
            }
        }

        //System.out.println(text.replaceAll(" +"," "));

        System.out.println(result+text.charAt(text.length()-1));
    }
}
