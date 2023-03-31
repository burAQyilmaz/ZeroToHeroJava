package day2;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {

//Find the largest of three taken numbers from user.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input first number: ");

        int num1 = scanner.nextInt();

        System.out.println("Input second number: ");

        int num2 = scanner.nextInt();

        System.out.println("Input third number: ");

        int num3 = scanner.nextInt();

        if (num1 > num2 && num1 > num3) {

            System.out.println("Largest number: " + num1);

        } else if (num2 > num1 && num2 > num3) {

            System.out.println("Largest number: " + num2);

        } else {
            System.out.println("Largest number: " + num3);


            int largest=num1;

            if(largest<num2){
                largest=num2;
            }
            if(largest<num3){
                largest=num3;
            }
            System.out.println("largest = " + largest);
        }

    }
}
