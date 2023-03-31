package day3;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        //Write a code that finds the number of positive divisors of a given number.

        Scanner scanner=new Scanner(System.in);

        System.out.println("enter a number: ");

        int num = scanner.nextInt();

        int counter=0;

        for (int i = 1; i <=num ; i++) {

            if(num%i==0)
                counter++;


        }
        System.out.println(counter);

    }
}
