package day4;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        //"Create a password using the first name and last name information obtained from the user as follows:
        // Concatenate the first letter of the name as a capital letter and the first letter of the last name as a capital letter,
        // then add the phrase '+1234' to the end.
        //Example Input: Ahmet Temel, Output: AT+1234"

        Scanner scanner=new Scanner(System.in);

        System.out.println("Input first name: ");

        String firstName = scanner.nextLine();

        System.out.println("Input second name: ");

        String secondName = scanner.nextLine();

        String passWord= firstName.substring(0,1).toUpperCase()+secondName.substring(0,1).toUpperCase()+"+1234";

        System.out.println(passWord);

        /* second sol:
        System.out.println("Input first name :");
        String firstName=scanner.next();

        System.out.println("Input last name :");
        String lastName=scanner.next();

        String firstLetterOfFirstName=String.valueOf(firstName.charAt(0)).toUpperCase();
        String firstLetterOfLastName=String.valueOf(lastName.charAt(0)).toUpperCase();

        String password=firstLetterOfFirstName+firstLetterOfLastName+"+1234";
        System.out.println("Password = " + password); */



    }
}
