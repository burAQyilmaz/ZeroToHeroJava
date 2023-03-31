package day13;

public class Ex1 {
    public static void main(String[] args) {

        /*
        *Display all the possible times in a 24-hour clock system on the screen? For example:

00:00
00:01
00:02
...
23:58
23:59
         */
        for (int i = 0; i < 24; i++) {

            for (int j = 0; j < 60; j++) {

                if (i < 10) {

                    System.out.print("0");
                }

                System.out.print(i + ":");

                if (j < 10) {

                    System.out.print("0");
                }

                System.out.println(j);
            }
        }
    }
}
