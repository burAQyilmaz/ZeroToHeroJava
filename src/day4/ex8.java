package day4;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {

        //Write a code that reverses any text input entered.

        Scanner scanner=new Scanner(System.in);

        System.out.println("Input a text: ");

        String text = scanner.nextLine();

        String reverseText= "";

        for (int i = text.length()-1; i >=0 ; i--) {

            reverseText+=text.charAt(i);

        }
        System.out.println(reverseText);

        //Second solution
        System.out.println("Input a text");
        String text1=scanner.nextLine();

        StringBuilder sb=new StringBuilder(text1);
        System.out.println(sb.reverse());
    }

}
