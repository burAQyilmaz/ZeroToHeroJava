package day4;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        //"Take 3 numbers from the user and if the numbers are different from each other, print 'Verified', otherwise print 'Invalid'."

        Scanner scanner=new Scanner(System.in);

        System.out.println("ınput first number: ");

        int n1= scanner.nextInt();

        System.out.println("ınput second number: ");

        int n2= scanner.nextInt();

        System.out.println("ınput third number: ");

        int n3= scanner.nextInt();

        if(n1!=n2 && n1!=n3 && n2!=n3){
            System.out.println("Verified");
        }else {
            System.out.println("invalid");
        }
    }
}
