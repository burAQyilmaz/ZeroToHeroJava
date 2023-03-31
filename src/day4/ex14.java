package day4;

public class ex14 {
    public static void main(String[] args) {

//"Convert the first letter of a given text to lowercase if it is uppercase, and to uppercase if it is lowercase."

        String text ="Cajnandcda";

        if( text.substring(0,1).toLowerCase().equals(text.substring(0,1))){

            System.out.println(text.substring(0,1).toUpperCase()+text.substring(1));
        }else {
            System.out.println(text.substring(0,1).toLowerCase()+text.substring(1));
        }

    }
}
