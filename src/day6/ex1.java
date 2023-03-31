package day6;

public class ex1 {
    public static void main(String[] args) {

        ////"If a text contains the word "java",
        // delete this word and print "word deleted".
        // If it does not contain it, print "word not found"."

        String text = "sdvnfknvfjavafknkv";

        if (text.contains("java")) {

            text.replace("java", "");

            System.out.println("word deleted");
        } else {
            System.out.println("word not found");
        }

    }
}
