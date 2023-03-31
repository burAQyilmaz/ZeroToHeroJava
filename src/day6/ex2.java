package day6;

public class ex2 {
    public static void main(String[] args) {

        ////*Get all uppercase letters from a given string and print  each uppercase letters in new line.


        String text="kfngıNAFIAomopmv";

        String upperCaseText="";

        for (int i = 0; i < text.length(); i++) {

            if((""+text.charAt(i)).equals((""+text.charAt(i)).toUpperCase())){

                upperCaseText+=text.charAt(i);

            }

        }

        System.out.println(upperCaseText);

//second sol:
        String str = "AbCdEfGS?",
                strUpper = str.toUpperCase();
        String result = ""; // ABCDEFGSH

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == strUpper.charAt(i)) {
                result += ch;

            }
        }

        System.out.println(result);

        //third sol:

        for (int i = 0; i < text.length(); i++) {

            if(Character.isUpperCase(text.charAt(i))){
                upperCaseText+=text.charAt(i);
            }
        }
    }
}
