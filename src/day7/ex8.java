package day7;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {

        // Wtite a program that takes 10 inputs from the user and finds the sum of the numeric inputs

        Scanner scan = new Scanner(System.in);

        int sum = 0;

        for (int i = 0; i < 10; i++) {

            System.out.println("Input a text");

            String text = scan.nextLine();

            if (text.matches("[0-9]+")) {

                sum += Integer.parseInt(text);

            }

        }

        System.out.println("sum = " + sum);
    }
}
