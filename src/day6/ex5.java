package day6;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {

        //"Set a password. The user has 3 attempts to guess the password. If the user finds the password within 3 attempts, 
        // print "login successful". If the password is not found after 3 attempts, print "your account has been suspended"."

        String password = "abcde";

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            System.out.println("enter password");

            String input = scan.nextLine();

            if (input.equals(password)) {

                System.out.println("login successful");
                break;
            }
            if (i == 2)

                System.out.println("your account has been suspended");

        }

    }
}
