package day1;

public class ex6 {
    public static void main(String[] args) {

        // find the average of numbers from 56 to 203;

        int sum = 0;

        int counter = 0;

        for (int i = 56; i <= 203; i++) {
            counter++;
            sum += i;

        }

        System.out.println("average is: " +(double) sum / counter);
    }
}
