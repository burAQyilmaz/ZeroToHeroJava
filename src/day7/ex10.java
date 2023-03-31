package day7;

public class ex10 {
    public static void main(String[] args) {

        //Write a program which changes each letter of a given string to next letter
        // in alphabetic order

        String text = "rkgrgmgjiaoevmz87";

        for (int i = 0; i < text.length(); i++) {

            int num = 0;

            num = text.charAt(i);

            if ((text.charAt(i) >= 'a' && text.charAt(i) <= 'y') || (text.charAt(i) >= 'A' && text.charAt(i) <= 'Y')) //if(Character.isAlphabetic(text.charAt(i)))

                System.out.print((char) (num + 1));

             else if (text.charAt(i) == 'z')

                System.out.print('a');

             else if (text.charAt(i) == 'Z')

                System.out.print('A');

             else

                System.out.print(text.charAt(i));

        }

    }

}
