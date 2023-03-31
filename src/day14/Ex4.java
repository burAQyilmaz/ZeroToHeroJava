package day14;

public class Ex4 {
    public static void main(String[] args) {

        //*write a program which checks
// if a five charactered string's first two characters are uppercase letters
// and next two characters are lowercase letters and last character is any vowel

        String text = "ABcde";

        System.out.println(text.matches("[A-Z]{2}[a-z]{2}[aeuioAEUIO]"));

        /*
        String regex = "[0-9A-Za-z_]" = "\\w"; //all digits and letters and _

        String regex1 = "[0-9]" = "\\d"; //digits

        String regex3 = "\\s"; //space
*/
    }
}
