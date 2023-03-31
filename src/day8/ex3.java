package day8;

public class ex3 {
    public static void main(String[] args) {

        //*List all palindrom numbers from 10 to 10000


        for (int j = 10; j <= 10000; j++) {

            String numString = Integer.toString(j);  //=""+num;    ||  =String.valueOf(num)


            String newText = "";

            for (int i = numString.length() - 1; i >= 0; i--) {

                newText += numString.charAt(i);

            }
            if (newText.equals(numString)) {

                System.out.println(newText);

            }
        }

    }
}
