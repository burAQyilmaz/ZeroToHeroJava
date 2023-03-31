package day8;

public class ex1 {
    public static void main(String[] args) {

        ////*Write a program that puts each digit in a string in double quotes
        ////Input Hello3Hi34
        ////Output Hello"3"Hi"3""4"

        String text = "Hello3Hi34";
        String newText = "";
        for (int i = 0; i < text.length(); i++) {
            char activeCharacter = text.charAt(i);
            if ((activeCharacter >= '0' && activeCharacter <= '9') ) {
                newText += "\"" + activeCharacter + "\"";

            } else {
                newText += activeCharacter;
            }

        }
        System.out.println("newText = " + newText);

        // second sol:

        String str = "Hello world 3Hi 34";
        str = str.replace(" ", "");
        String str1 = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9') {

                str1 += "\"" + ch + "\"";

            } else {
                str1 += ch;

            }


        }

        System.out.print(str1);

        // third sol:

        String text2 = "Hello3Hi34";
        text2 = text2.replaceAll("[0-9]", "\"$0\"");   //$0 regexle eşleşen karakteri temsil ediyor
        System.out.println("text2 = " + text2);


    }
}
