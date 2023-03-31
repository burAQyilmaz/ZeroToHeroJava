package day12;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        /*
        *Take from the user five names and five ages and print them like example
Input
Yunus
34

Ferhat
28
.
.
.
Output
Yunus is 34 years old.
Ferhat is 28 years old.
.
.
.
The older one is Yunus.
         */

        Scanner scanner = new Scanner(System.in);

        String[] names = new String[5];

        int[] ages = new int[5];

        int oldest = 0;

        String oldestPerson = "";

        for (int i = 0; i <5; i++) {

            System.out.println("Enter " + (i+1) + ". name:");
            names[i] = scanner.nextLine();

            System.out.println("Enter " + (i+1) + ". age:");
            ages[i] = scanner.nextInt();

            scanner.nextLine();

            if (oldest < ages[i]) {
                oldest=ages[i];
                oldestPerson=names[i];
            }

        }
        for (int i = 0; i < 5; i++) {

            System.out.println(names[i] + " is " + ages[i] + " years old.");
        }

        System.out.println("\nThe older one is " + oldestPerson + ".");

        scanner.close();
    }
}
