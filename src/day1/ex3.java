package day1;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        // take 10 names from user and print them to console

        String[] names = new String[10];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < names.length; i++) {

            System.out.print("Input " + (i + 1) + ". name: ");
            names[i] = scanner.nextLine();
        }

        for (int i = 0; i < names.length; i++) {

            System.out.println(names[i]);
        }

    }
}
