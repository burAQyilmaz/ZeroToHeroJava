package day12;

public class ex4 {
    public static void main(String[] args) {

        /*
         *write a program which counts "k" letters in a string with using .split()
         */

        String text="fnfsgn kgfdnnnnn ajdfgkfj kjfagbaikdk";

        int count= text.split("k").length;

        if(text.charAt(text.length()-1)=='k') System.out.println(count);

        else System.out.println(count-1);
    }
}
