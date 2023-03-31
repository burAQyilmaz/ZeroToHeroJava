package day4;

public class ex4 {
    public static void main(String[] args) {

//Find the sum of digits of a four-digit number entered.

        int num = 1234;

        int sum =0;

        while (num > 0) {

            sum += num % 10;
            num /= 10;

        }
        System.out.println(sum);

    }
}
