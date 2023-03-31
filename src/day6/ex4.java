package day6;

import java.util.Locale;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {

        ////"Print the letters of an entered text in alternating uppercase and lowercase format."
        //Input "hello"
        //Output "HeLlO";


        Scanner input =new Scanner(System.in);
        System.out.println("Enter a text.");
        String text1=input.nextLine();
        String temp="";


        for (int i = 0; i <text1.length() ; i++) {
            if(i % 2 ==0){
                temp+=text1.substring(i,i+1).toUpperCase();
            }else{
                temp+=text1.substring(i,i+1).toLowerCase();
            }
        }

        System.out.println(temp);


    }

}
