package day3;

public class ex9 {
    public static void main(String[] args) {
//Find if the given number is prime or not.

        int num = 45;

        boolean isPrime = true;

        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
