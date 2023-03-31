package day2;

public class ex8 {
    public static void main(String[] args) {
        //"Get the user's age information.
//If the age is between 1-3, print "baby"
//If the age is between 4-13, print "child"
//If the age is between 14-18, print "teenager"
//If the age is 19 or older, print "adult"

        int age = 34;

        System.out.println((1 <= age && age <= 3) ? "baby"  :(4 <= age && age <= 13) ?"child" :(14 <= age && age <= 18)?
        "teenager" :"adult");
    }
}
