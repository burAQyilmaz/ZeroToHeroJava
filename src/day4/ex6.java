package day4;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {

        //Make the first letter of each two  word in the text input entered by the user uppercase.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input first and second word: ");

        String words = scanner.nextLine();

        words = words.toLowerCase();

        System.out.println(words.substring(0, 1).toUpperCase() + words.substring(1, words.indexOf(" ")) + " " + words.substring(words.indexOf(" ") + 1, words.indexOf(" ") + 2).toUpperCase() + words.substring(words.indexOf(" ") + 2));


    }
}
