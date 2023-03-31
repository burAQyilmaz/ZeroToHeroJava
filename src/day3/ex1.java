package day3;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        //Take 4 numbers from user, calculate their average, and print the result to the screen.

        Scanner scanner =new Scanner(System.in);

        System.out.println("enter first number: ");

        int num1= scanner.nextInt();

        System.out.println("enter second number: ");

        int num2= scanner.nextInt();

        System.out.println("enter third number: ");

        int num3= scanner.nextInt();

        System.out.println("enter forth number: ");

        int num4= scanner.nextInt();

        System.out.println("average: "+(double)(num1+num2+num3+num4)/4);



    }
}
