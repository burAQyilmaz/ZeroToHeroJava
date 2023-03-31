package day1;

public class ex7 {
    public static void main(String[] args) {
        //Check if given string variable starts with "a" and
        // has less than five characters
        // (output must be true or false)

        String text = "kaefmaıenf";

        System.out.println(text.startsWith("a") && text.length() > 5);

    }
}
