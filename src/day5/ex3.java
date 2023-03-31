package day5;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {

        //*Take numbers from the user until zero is entered. Find the sum of the all numbers.

        Scanner scan = new Scanner(System.in);

        int sum=0;

        while(true){
            System.out.println("enter a number:");
            int num = scan.nextInt();

            if(num==0){
                break;

            }  sum+=num;
        }
        System.out.println(sum);





    }
}
