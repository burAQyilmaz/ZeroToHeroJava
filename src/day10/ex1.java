package day10;

public class ex1 {
    public static void main(String[] args) {

        // *write a program that counts the uppercase vowels of a given sentences

        String sentence = "DSkdvnnaeioUvjfnkjanveea vnOijvnE";

        String upperVowels = "AEUIO";

        int counter = 0;

        for (int i = 0; i < sentence.length(); i++) {

                if (upperVowels.contains(sentence.substring(i,i+1))) {

                    counter++;

                }
        }
        System.out.println(counter);

        System.out.println(sentence.replaceAll("[^AEUIO]","").length());
    }
}
