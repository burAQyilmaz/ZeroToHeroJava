package day12;

import java.util.Random;

public class ex3 {
    public static void main(String[] args) {
        /*
         *Write 100 random five-letter words. They do not need to be meaningful
         */

        Random random = new Random(100);

        String letters = "";

        for (char i = 'a'; i < 'z'; i++) {

            letters += i;
        }
        for (char i = 'A'; i < 'Z'; i++) {

            letters += i;
        }

        for (int i = 1; i <= 100; i++) {

            String word = "";

            for (int j = 0; j < 5; j++) {

                word += letters.charAt(random.nextInt(letters.length()));
            }

            System.out.println(word);
        }

    }
}
