package day5;

public class ex4 {
    public static void main(String[] args) {
        //*Find the number of the words of a given sentences

        String text="jfghjf fkjgkjfg jfgksjhg kjsfgkjsdhg";

        int counter=0;

        for (int i = 0; i < text.length(); i++) {

            if(text.substring(i,i+1).equals(" ")){

                counter++;
            }

        }
        System.out.println(counter+1);

        //System.out.println(text.split(" ").length);

/*
String str = "Ey edip adanada pide ye";

        int counter = 1;

        while (str.contains(" ")) {

            str = str.replaceFirst(" ", "");
            counter++;

        }

        System.out.println(counter);
 */

    }
}
