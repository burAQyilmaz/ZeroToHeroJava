package day13;

public class ex5 {
    public static void main(String[] args) {
        /*
        write a program which checks if an eight charactered string's first two characters are number and
         next two characters are lowercase letters and next three characters are any number and last character is upparcase letter.
         */

        String word = "34gf456W";

        if ((word.charAt(0) >= '0' && word.charAt(0) <= '9') &&
                (word.charAt(1) >= '0' && word.charAt(1) <= '9') &&
                (word.charAt(2) >= 'a' && word.charAt(2) <= 'z') &&
                (word.charAt(3) >= 'a' && word.charAt(3) <= 'z') &&
                (word.charAt(4) >= '0' && word.charAt(4) <= '9') &&
                (word.charAt(5) >= '0' && word.charAt(5) <= '9') &&
                (word.charAt(6) >= '0' && word.charAt(6) <= '9') &&
                (word.charAt(7) >= 'A' && word.charAt(7) <= 'Z')) {

            System.out.println("oldu oldu");
        } else {
            System.out.println("nah oldu");
        }
        //Second sol:
        System.out.println(word.matches("[0-9]{2}[a-z]{2}[0-9]{3}[A-Z]"));
    }
}
