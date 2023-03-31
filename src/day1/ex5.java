package day1;

public class ex5 {
    public static void main(String[] args) {

        //find the sum of the odd numbers from 50, 304

        int sumOdd = 0;

        for (int i = 51; i <=303 ; i+=2) {

            sumOdd+=i;

        }
        System.out.println(sumOdd);
    }
}
