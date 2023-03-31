package day11;

public class ex4 {
    public static void main(String[] args) {

        //*write the biggest prime number in integer range

        int biggest = Integer.MAX_VALUE;

        for (int i = biggest; i > 0; i--) {

            boolean isPrime = true;


            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i);
                break;
            }
        }
    }
}
