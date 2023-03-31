package day8;

public class ex5 {
    public static void main(String[] args) {
           /*
    Edit a given text so that the repeating characters in the text are at the end,
    the non-repeating characters are at the beginning and the comma is between the two.
     */
        String text = "aabbdcccaagregbccbnhtraa";

        String uniqChars = "";
        String dubliqateChar = "";

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (text.indexOf(ch) == text.lastIndexOf(ch)) {

                uniqChars += text.charAt(i);

            } else {
                if(!dubliqateChar.contains(""+ch))

                dubliqateChar+=ch;
            }
        }

        System.out.println(uniqChars + "," + dubliqateChar);

        //second sol:

        String str = "adfmsidkg DİKLFNgnisn SDKNg";
        String repeating = "",
                nonRepeating = "";

        for (int i = 0; i < str.length(); i++) {

            String ch = String.valueOf(str.charAt(i));

            if (str.replaceFirst(ch, "").contains(ch)) {

                if (!(repeating.contains(ch))) { // to make the repeating char unique
                    repeating += ch;
                }

            } else {
                nonRepeating += ch;
            }

        }

        System.out.println(nonRepeating + "," + repeating);
    }
}

