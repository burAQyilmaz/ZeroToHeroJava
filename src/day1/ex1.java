package day1;

public class ex1 {
    public static void main(String[] args) {
        // find the count of digits of the number

        int number = 234;

        int counter = 0;

        int temp=number;

        while(number>0){

            counter++;

            temp/=10;

        }
        System.out.println(counter);

    }
}
