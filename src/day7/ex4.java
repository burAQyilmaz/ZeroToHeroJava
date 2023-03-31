package day7;

public class ex4 {
    public static void main(String[] args) {

        //*print all five-digit numbers which do not contain the number of 9
        int counter = 0;

        for (int i = 10_000; i < 100_000; i++) {

            boolean hasNotNine = true;
            int temp = i;

            while (temp > 0) {

                int digit = temp % 10;

                temp /= 10;

                if (digit == 9) {

                    hasNotNine = false;

                    break;
                }

            }
            if (hasNotNine){
                counter++;
            System.out.println(i);}

        }
        System.out.println("counter = " + counter);

//second sol:

        int count=0;
        for (int i = 10000; i <=99999 ; i++) {
            String number=Integer.toString(i);

            if(!number.contains("9")){
                count++;
                System.out.println(i);
            }
        }

        System.out.println("count = " + count);

    }
}
