package day7;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {

        //Write a program which asks user to input a number
        // and check if it is even or not and print the result. Then ask user to continue or not

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("input a number");

            int num = scanner.nextInt();

            if (num % 2 == 0) {

                System.out.println(num + " is even");

            } else {
                System.out.println(num + " is odd");

            }
            scanner.nextLine();
            System.out.println("do you want to continue?");
            String yesOrNo = scanner.nextLine();

            while(!(yesOrNo.equalsIgnoreCase("yes") || (yesOrNo.equalsIgnoreCase("no")))){
                System.out.println("please ınput yes or no");
                yesOrNo= scanner.nextLine();
            }
            if (yesOrNo.equalsIgnoreCase("no")) {
                System.out.println("thanks");
                break;
            }
        }


    }
}
