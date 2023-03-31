package day14;

public class Ex3 {

    public static void main(String[] args) {

        // change all numbers which are less than 6 to '&' in a given string

        String text = "yunus2365kulcu831105";

        System.out.println(text.replaceAll("[1-5]", "&"));

//second sol:
        String newText = "";

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (ch >= '0' && ch < '6') {

                newText += '&';

            } else {

                newText += ch;
            }
        }
        System.out.println(newText);
    }
}
