package day2;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        //Create a basic calculator program
        //that takes operation and numbers from the user and
        //performs(switch))

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first number: ");

        int num1 = scanner.nextInt();

        System.out.print("Input second number: ");

        int num2 = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Input operator: ");

        String op = scanner.nextLine();

        switch (op) {

            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
            default:
                System.err.println("Invalid operator");
                break;
        }

    }
}
