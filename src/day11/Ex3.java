package day11;

public class Ex3 {
    public static void main(String[] args) {

        // *Reverse each word of a given sentences

        String sentence = "jfgk gfjgslm gklfagnla";

        String result = "";

        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {

            String word = words[i];

            String reverseWord = "";

            for (int j = word.length() - 1; j >= 0; j--) {

                reverseWord += word.charAt(j);

            }
            result += reverseWord+" ";
        }
        System.out.println(result.trim());

    }
}
