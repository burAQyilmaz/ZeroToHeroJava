package day1;

import java.util.Arrays;

public class ex9 {
    public static void main(String[] args) {

        // print the odd numbers from an integer array;

        int[] numbers = {34, 56, 76, 67, 89, 11};

        Arrays.stream(numbers).filter(i -> i % 2 != 0).forEach(System.out::println);

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 != 0) {

                System.out.println(numbers[i]);
            }

        }
    }
}
