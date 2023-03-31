package day1;

public class ex2 {
    public static void main(String[] args) {
        // fşnd the total of digits of te number

        int num = 784523;

        int temp = num;

        int SumOfDigits = 0;

        while (temp > 0) {

            SumOfDigits += temp % 10;
            temp /= 10;

        }
        System.out.println(SumOfDigits);
    }
}
