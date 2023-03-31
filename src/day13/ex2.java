package day13;

public class ex2 {
    public static void main(String[] args) {

        /*
        *write a program that takes a string as input, takes the ASCII code of each character in the string,
        * concatenates them with a comma between each code, and then converts the resulting string back to
        * the original string with letters?"
Input
 Hello, World!
Output
72,101,108,108,111,44,32,87,111,114,108,100,33
Hello, World!
         */
        String word = "Hello, World!";

        String ascii = "";

        for (int i = 0; i < word.length(); i++) {

            ascii += (int) word.charAt(i) + ",";
        }
        System.out.print(ascii.substring(0, ascii.length() - 1));

        System.out.println();

        String[] asciiChars = ascii.split(",");


        for (int i = 0; i < asciiChars.length; i++) {

            System.out.print((char) Integer.parseInt(asciiChars[i]));

        }

    }
}
