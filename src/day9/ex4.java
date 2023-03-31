package day9;

public class ex4 {
    public static void main(String[] args) {

        /*
        *Write a program which changes the given word by writing the last vowel of the word three times.
Input : "teacher"
Output : "teacheeer"
         */

        String word = "teacher";

        String newWord = "";

        String vowels = "aeiouAEIOU";


        for (int j = word.length() - 1; j >= 0; j--) {

            String lastVowel = word.substring(j, j + 1);

            if (vowels.contains(lastVowel)) {

                System.out.println(word.substring(0, j) + word.substring(j, j + 1).repeat(3) + word.substring(j + 1));

                break;

            }

        }

    }
}
