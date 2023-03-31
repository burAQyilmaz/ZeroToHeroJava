package day7;

public class ex6 {
    public static void main(String[] args) {

        //List all four-digit numbers where the sum of digits equal to 10

        for (int i = 1000; i < 10000; i++) {

            int sum = 0;
            int temp = i;

            while (temp > 0) {

                sum += temp % 10;

                temp /= 10;

            }
            if (sum == 10) {

                System.out.println(i);

            }

        }

    }
}
