package day14;

import java.util.Arrays;

public class ex2 {
    public static void main(String[] args) {

        //Print each word that starts with an uppercase letter and continues with lowercase letters in a given sentence

        String text = "jdfbjas kfngkfs YgnkflKsng Poorpagmv bkamia";

        String[] words = text.split(" ");

        for (int i = 0; i < words.length; i++) {

            String word = words[i];

//second sol:
           /* if (word.matches("[A-Z][a-z]+")) {   //First letter must be upper case
                                                   //Second and other letters must be lowercase
                System.out.println(word);
            }
            */

            if ((word.toUpperCase().charAt(0) == word.charAt(0)) &&
                    (word.substring(1).toLowerCase().equals(word.substring(1))))

                System.out.println(word);
        }
        //third sol:
        Arrays.stream(words).filter(i -> (i.toUpperCase().charAt(0) == i.charAt(0))&&(i.substring(1).toLowerCase().equals(i.substring(1)))).forEach(System.out::println);
    }
}
