package day10;

public class ex4 {
    public static void main(String[] args) {

        //*write a program that finds the sum of numbers from 1 to the factorial of a given number

        int num = 5;

        int sum = 0;

        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        for (int i = 1; i <= factorial; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}
