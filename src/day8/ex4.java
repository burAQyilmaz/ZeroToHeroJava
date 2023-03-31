package day8;

public class ex4 {
    public static void main(String[] args) {

        ////A number is called an Armstrong number
        // if it is equal to the cube of its every digit. For example,
        // 153 is an Armstrong number because of 153= 1+ 125+27,
        // which is equal to 1^3+5^3+3^3. You need to write a program to
        // check if the given number is Armstrong number or not.

        int num = 153;

        int sumOfCube = 0;

        int temp = num;

        while (temp>0) {

            int digit = temp % 10;

            sumOfCube += digit * digit * digit;

            temp /= 10;
        }

        if (sumOfCube == num) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }

    }
}
