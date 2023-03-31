package day6;

public class ex3 {
    public static void main(String[] args) {

        ////"Write a code that verifies if all the digits of a three-digit number are different."

        int num = 332;

        int birler = num % 10;
        int onlar = num / 10 % 10;
        int yuzler = num / 100;

        if (birler != onlar && birler != yuzler && yuzler != onlar) {

            System.out.println("All the digits of a three-digit numbers are different.");

        }else
            System.out.println("All the digits of a three-digit numbers are not different.");

    }
}
