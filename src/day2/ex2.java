package day2;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        //"1) Get a text from the user
//2) Replace all "a" characters in the text with "o"

//Convert all characters to lowercase
//Print the final result to the screen"


        Scanner scanner= new Scanner(System.in);

        System.out.println("Input a text: ");

        String text = "dhAgdVFDysa paoğtoDZFBpasj aslfkogjBFZs vfjknKGDNaamlfa";

        text = text.replace("a", "o").toLowerCase();

        System.out.println(text);


    }
}
