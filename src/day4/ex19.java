package day4;

import java.util.stream.IntStream;

public class ex19 {
    public static void main(String[] args) {

        //"Find the sum of positive divisors of a given number."

        int num=432;
        int sum=0;

        for (int i = 1; i <=num ; i++) {

            if(num%i==0){
                sum+=i;

            }

        }
        System.out.println(sum);

    }
}
