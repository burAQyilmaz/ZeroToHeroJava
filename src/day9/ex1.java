package day9;

public class ex1 {
    public static void main(String[] args) {

        //*Write a program that counts  the number of the letters of a given sentences.
        // (Not including special characters, numbers and spaces)

        String text = "nik$sngur*dkm knv3rerm oe78wpfk";
        int counter = 0;

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                counter++;
            }
        }
        System.out.println("counter = " + counter);

        System.out.println("---------------------------------------------------------");

        String text1 = "nik$sngur*dkm knv3rerm oe78wpfk";

        System.out.println(text1.replaceAll("[^a-zA-Z]", "").length());

        //Third solution
        String text3="Hi, my name is Yunus.";
        int count2=0;
        for (int i = 0; i <text.length() ; i++) {
            char activeChar=text.charAt(i);
            if(Character.isAlphabetic(activeChar)) count2++;
        }
        System.out.println("counter = " + counter);
    }
}
