package day9;

public class ex3 {
    public static void main(String[] args) {

        /*
        *Re-write a given word by sorting the letters of the word. (Don't use special Turkish letters)
input : car
output : acr
         */

        String word = "kfgkfgkndfvaergx";

        String newWord = "";

        for (char j = 'a'; j <= 'z'; j++) {

            for (int i = 0; i < word.length(); i++) {

                if (("" + j).equalsIgnoreCase(word.substring(i, i + 1)))
                    newWord += word.charAt(i);

            }
        }
        System.out.println("newWord = " + newWord);
    }
}
