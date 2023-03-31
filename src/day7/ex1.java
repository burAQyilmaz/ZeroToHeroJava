package day7;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        //Take a ten-digit Phone number and print it like this:
        //(541) 340 54 92

        Scanner scan = new Scanner(System.in);

        System.out.println("Input phone number(ten digits)");

        String phoneNumber= scan.nextLine();  //1234567890

        String print="(" + phoneNumber.substring(0,3) +") " + phoneNumber.substring(3,6)+ " "
                + phoneNumber.substring(6,8) + " " + phoneNumber.substring(8);

        System.out.println(print);

    }
}
