package day2;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {

        //1) Get a number from the user
//Print the sum of all numbers from 1 to the entered number on the screen

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a number: ");

        int num = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= num; i++) {

            sum += i;

        }

        System.out.println(sum);

    }
}
