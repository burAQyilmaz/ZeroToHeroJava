package day4;

import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {

        //"Write a code that verifies that all digits of a three-digit number are different."

        Scanner scan=new Scanner(System.in);

        System.out.print("Input a three-digit number: ");

        int num= scan.nextInt();

        if(num%10!=num/100  &&  num%10!=num/10%10  &&  num/100!=num/10%10)

            System.out.println("all digits of a three-digit number are different");

        else
            System.out.println("all digits of a three-digit number are not different");


    }
}
