package day4;

public class ex18 {
    public static void main(String[] args) {
//"Print the longest of three given texts."

        String text1 = "knlkfnglkf";
        String text2 = "fknslfknfsfsvlfmb";
        String text3 = "wkmfd";

        String longest = text1;

        if (text1.length() < text2.length()) {

            longest = text2;

        }
        if (text2.length() < text3.length()) {

            longest = text3;

        }

        System.out.println(longest);

    }
}
