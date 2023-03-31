package day1;

import java.util.Arrays;

public class ex10 {
    public static void main(String[] args) {
        //Find the average of an integer array;

        int[] numbers = {23,45,67,89,15,55};

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {

            sum+=numbers[i];

        }

        System.out.println("average is: "+ (double) sum/ numbers.length);

        System.out.println(Arrays.stream(numbers).average().getAsDouble());
    }
}
