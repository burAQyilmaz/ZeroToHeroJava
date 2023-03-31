package day2;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
//Get start and end values from the user
//Print all even numbers in the range.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input first number: ");

        int num1 = scanner.nextInt();

        System.out.println("Input second number: ");

        int num2 = scanner.nextInt();

        for (int i = Math.min(num1, num2); i <= Math.max(num1, num2); i++) {

            if (i % 2 == 0)

                System.out.println(i);

        }


    }
}
