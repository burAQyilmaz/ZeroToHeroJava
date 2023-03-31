package day4;

public class ex16 {
    public static void main(String[] args) {
        //Using an if statement, find the number of digits in a given number between 1 and 1000.

        int num=456;

        if(num>=1 && num<=1000){

        if(num/10==0)
            System.out.println("1");
        else if(num/100==0)
            System.out.println("2");
        else if(num/1000==0)
            System.out.println("3");
        else System.out.println("4");}

        else {
            System.out.println("ınvalid number");

        }
//second sol:
        int counter=0;
        while(num>0){
            counter++;
            num/=10;
        }
        System.out.println(counter);
    }
}
