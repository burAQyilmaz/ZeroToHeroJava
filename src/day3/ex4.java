package day3;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {

        //Ask the user for a text input. Print the text as many times as the number of characters in the text.

        Scanner scanner=new Scanner(System.in);

        System.out.println("enter a text: ");

        String text= scanner.nextLine();

        for (int i = 1; i <=text.length() ; i++) {

            System.out.println(text);

        }

        System.out.println((text + "\n").repeat(text.length()));

    }
}
