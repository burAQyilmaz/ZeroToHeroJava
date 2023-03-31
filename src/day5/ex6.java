package day5;

public class ex6 {
    public static void main(String[] args) {

        // *Change a given string like this:
        //Concat all numeric characters at the begining and all other characters at the ending and print new string
        //Example
        //Input.     a45ge89tu
        //Output   4589agetu

        String text = "fjg9875dsfh857gknf";

        String textAlpha= text.replaceAll("[0-9]","");
        String textNum = text.replaceAll("[^0-9]", "");

        System.out.println(textNum+textAlpha);

// second sol:
        String text1 = "a45ge89tu";
        String numbers = "";
        String letters = "";

        for (int i = 0; i < text1.length(); i++) {

            if (text1.charAt(i) >= '0' && text1.charAt(i) <= '9') {
                numbers += text1.charAt(i);
            } else  {
                letters += text1.charAt(i);
            }

        }

        System.out.println(numbers + letters);
    }
}
