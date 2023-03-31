package day8;

public class ex2 {
    public static void main(String[] args) {

        //*Write a code which reverse a given number

        int num= 12345;

        String numString= Integer.toString(num);  //=""+num;    ||  =String.valueOf(num)

        String newText="";

        for (int i = numString.length()-1; i >=0 ; i--) {

            newText+=numString.substring(i,i+1);

        }

        System.out.println(newText);

     //Second Solution
        num=2361;
        int reversedNum=0;

        while (num>0){
            int digit=num % 10;
            reversedNum+=digit;
            if(num>9) reversedNum*=10;

            num/=10;
        }

        System.out.println("reversedNum = " + reversedNum);

    }
}
