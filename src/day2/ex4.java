package day2;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {

        //1) Get a number between 1 and 12 from the user
//2) Calculate the factorial of the number

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a number between 1 and 12: ");

        int num = scanner.nextInt();

        int multi = 1;

        for (int i = 1; i <= num; i++) {

            multi *= i;

        }
        System.out.println(multi);

    }
}
