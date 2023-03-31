package day3;

public class ex8 {
    public static void main(String[] args) {
        //Write a program that finds the smallest of three numbers.

        int n1 = 23;
        int n2 = 45;
        int n3 = 51;

        int smallest = n1;

        if (smallest > n2) {
            smallest = n2;
        }
        if (smallest > n3)
            smallest = n3;


        System.out.println(smallest);

}
}
