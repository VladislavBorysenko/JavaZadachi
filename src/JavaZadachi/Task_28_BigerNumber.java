package JavaZadachi;

import java.util.Scanner;

public class Task_28_BigerNumber {
    public static void main(String[] args) {
        int a, b;

        Scanner scaner = new Scanner(System.in);
        a= scaner.nextInt();
        b= scaner.nextInt();
        bigger(a,b);
    }

    public static int bigger(int a, int b) {
        int bigger;
        if (a < b) {
            bigger = b;
        } else {
            bigger = a;
        }
        System.out.println(bigger);
        return bigger;
    }
}
