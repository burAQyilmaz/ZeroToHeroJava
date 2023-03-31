package day7;

public class ex7 {
    public static void main(String[] args) {

        // print the sum of digits of each numbers between 1 and 10000.

        for (int i = 1; i < 10000 ; i++) {

            int sum = 0;
            int temp =i;

            while (temp>0){

                sum+=temp%10;

                temp/=10;

            }
            System.out.println("Sum of digits of Number "+ i + " is " +sum );

        }

    }
}
