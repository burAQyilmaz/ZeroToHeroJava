package day4;

public class ex17 {
    public static void main(String[] args) {
        ////Print the factorial of all numbers from 1 to 12.



       /* for (int i = 1; i <=12 ; i++) {
            int fac=1;

            for (int j = 1; j <=i ; j++) {
                fac*=j;
                ;
            }
            System.out.println("for "+i+ " is "+fac);
        }*/


        for (int i = 1; i <=12 ; i++) {

            factoriyal(i);

        }


    }

    private static void factoriyal(int i) {

int multi=1;

        for (int j = 1; j <=i ; j++) {

            multi*=j;

        }
        System.out.println(multi);
    }

}
