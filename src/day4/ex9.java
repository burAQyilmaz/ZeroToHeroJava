package day4;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {

        //Check if a given word is a palindrome.

        Scanner scanner=new Scanner(System.in);

        System.out.println("Input a text: ");

        String text = scanner.nextLine();

        String textReverse="";

        for (int i = text.length()-1; i >=0 ; i--) {

            textReverse+=text.charAt(i);

        }

if(text.equals(textReverse))
    System.out.println(text+" is a  palindrome");
    else{
        System.out.println(text+ " is not a palindrome");
    }


        System.out.println("Input a word :");
        String word=scanner.nextLine();

        StringBuilder sb=new StringBuilder(word);

        if(word.equals(sb.reverse().toString())){  // must convert to string because string builder is not string
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}
