package day5;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        //*Take 10 numbers from the user and find the largest of them.

        Scanner scan = new Scanner(System.in);

        int largest = Integer.MIN_VALUE;

        for (int i = 1; i <=10 ; i++) {
            System.out.println("Enter number "+i+ ":");
            int num= scan.nextInt();

            if(num>largest){

                largest=num;
            }

        }
        System.out.println(largest);
    }
}
