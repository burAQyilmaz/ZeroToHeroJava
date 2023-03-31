package day11;

public class Ex2 {
    public static void main(String[] args) {

        //*Remove all letters which is before 'm' in alphabetic order from a given word

        String word = "gaknrbnakafm";

        String result = "";

        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);

            if ((ch >= 'm' && ch<='z') || (ch >= 'M' && ch<='Z') )
                result += ch;

        }
        System.out.println(result);

        System.out.println(word.replaceAll("[^M-Zm-z]", ""));
    }

}

