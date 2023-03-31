package day12;

public class ex2 {
    public static void main(String[] args) {

        /*
         *Put "-" after each vowel which is before another vowel in a string
         */

        String word = "kmfgsertuudlmvklvmfkrrofoofuu";

        String vowels = "aeuıoAEUIO";

        String newWord = "";

        for (int i = 0; i < word.length()-1; i++) {

            newWord += word.charAt(i);

            if (vowels.contains("" + word.charAt(i)) && vowels.contains("" + word.charAt(i+1)))
                newWord += "-";

        }
        System.out.println(newWord + word.charAt(word.length()-1));
    }
}
