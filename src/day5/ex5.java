package day5;

public class ex5 {
    public static void main(String[] args) {

        //*Print all three-digit numbers with 1,3,5,6,9,0 and print how many numbers you printed

        int[] numbers = {1, 3, 5, 6, 9, 0};

        int counter = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                for (int k = 0; k < numbers.length; k++) {

                    if (numbers[k]!= 0) {

                        int num = numbers[k] * 100 + numbers[j] * 10 + numbers[i];

                        System.out.println(num);
                        counter++;
                    }


                }

            }

        }
        System.out.println(counter);

        //second sol:
        //Second solution
        int count=0;
        for (int i = 100; i <=999 ; i++) {
            String actualNum=String.valueOf(i);
            if(actualNum.matches("[125690]+")) {
                count++;
            }
        }

        System.out.println("count = " + count);


    }
}
