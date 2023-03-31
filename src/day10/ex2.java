package day10;

import java.util.Arrays;

public class ex2 {
    public static void main(String[] args) {

        //*write a program that sorts three given words in alphabetic order

        String word1 = "auıfbauı";
        String word2 = "vtneıt";
        String word3 = "rtyrwoıt";

        String[] words = {word1, word2, word3};

        Arrays.sort(words);

        System.out.println(Arrays.toString(words));

        /*
        second sol: compareTo ile yapılabilir!!!
        String metin1="selam";
        String metin2="selefon";

        System.out.println(metin1.compareTo(metin2));
         */


    }
}
