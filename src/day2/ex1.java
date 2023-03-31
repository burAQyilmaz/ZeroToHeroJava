package day2;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        //"Take three numbers from the user and print their average to the screen."

        Scanner scanner= new Scanner(System.in);

        System.out.println("Input first number: ");

        int num1= scanner.nextInt();

        System.out.println("Input second number: ");

        int num2= scanner.nextInt();

        System.out.println("Input third number: ");

        int num3= scanner.nextInt();

        System.out.println("average: "+ (double)(num1 + num2 + num3)/3);

    }
}
