package day1;

import java.util.Arrays;

public class ex8 {
    public static void main(String[] args) {

        //Find the sum of the all integers of an array

        int[] numbers = {34,56,78,90,12,274,321,7};

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {

            sum+=numbers[i];

        }

        System.out.println(sum);

        System.out.println(Arrays.stream(numbers).sum());

    }
}
