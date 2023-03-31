package day3;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        //Ask the user for a text input. Convert all characters in the text to uppercase and print the final text to the screen.

        Scanner scanner=new Scanner(System.in);

        System.out.println("ınput a text: ");

        String text = scanner.nextLine();

        System.out.println(text.toUpperCase());


    }
}
