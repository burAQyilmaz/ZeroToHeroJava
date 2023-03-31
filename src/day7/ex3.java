package day7;

public class ex3 {
    public static void main(String[] args) {

        // add '*' character between each characters of a given string

        String text ="kşfngı rahgıri";

        String textWithoutSpace=text.replace(" ","");

        for (int i = 0; i < textWithoutSpace.length(); i++) {

            textWithoutSpace=textWithoutSpace.substring(i,i+1)+"*";

            System.out.print(textWithoutSpace.substring(0,textWithoutSpace.length()-1));

        }

//Second solution
        String word="hello";
        word=word.replace("","*");
        word=word.substring(1,word.length()-1);
        System.out.println("word = " + word);

    }
}
