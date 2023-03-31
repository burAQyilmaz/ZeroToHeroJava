package day13;

import java.util.Random;

public class Ex3 {
    public static void main(String[] args) {

        /*
        Create a string which contains only random 10_000 lowercase  characters and check if the string contains "you"
         */

        Random random = new Random();

        String chars = "";
        String text10000 = "";

        for (char i = 'a'; i <= 'z'; i++) {

            chars += i;
        }

        for (int i = 0; i <= 10000; i++) {
            int index = random.nextInt();
            index=random.nextInt(chars.length());
            text10000 += chars.charAt(index);
        }

        if (text10000.contains("you")) System.out.println("yes");

        else System.out.println("no");
    }
}
