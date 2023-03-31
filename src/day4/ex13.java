package day4;

public class ex13 {
    public static void main(String[] args) {

        //"Write a code that removes all digits in a given text."

        String text= "dsanjds98275gklfdn93485glşsm";

        System.out.println( text.replaceAll("[0-9]",""));

        //second sol:

        text=text.replace("0","").
                replace("1","").
                replace("2","").
                replace("3","").
                replace("4","").
                replace("5","").
                replace("6","").
                replace("7","").
                replace("8","").
                replace("9","");

        System.out.println(text);

    }
}
