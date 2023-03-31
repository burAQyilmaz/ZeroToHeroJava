package day4;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {

        //"Add the * character before the first the word of 'gold' in a given text."

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a text: ");

        String text = scanner.nextLine();

        String textNew = text.substring(0, text.indexOf("gold")) + "*" + text.substring(text.indexOf("gold"));

        System.out.println(textNew);
//Second solution
        String text2="Hi, this is gold";
        text2=text2.replaceFirst("gold","*gold");
        System.out.println(text2);
    }
}
