package day4;

import java.util.stream.IntStream;

public class ex15 {
    public static void main(String[] args) {

        ////Write a program to find the average of numbers in the range [7-30].

        int sum =0;
        int counter=0;

        for (int i = 7; i <=30 ; i++) {

            sum+=i;
            counter++;

        }
        System.out.println((double) sum/counter);

        System.out.println((double) IntStream.rangeClosed(7,30).average().getAsDouble());
    }
}
