package JavaZadachi;

import java.util.Scanner;

public class Task_2_MethodSumScanner {
    /* public static void main(String[] args) {
        sumScanner(12,23);
     }*/
    public static int sumScanner() {
        int sum;
        int a, b;
        Scanner number = new Scanner(System.in);
        System.out.println("Please enter number a: ");
        a = number.nextInt();
        System.out.println("Please enter number b: ");
        b = number.nextInt();
        sum = a + b;
        System.out.println(sum);
        return sum;

    }

    public static int sumScanner(int a, int b) {
        int sum;
        //  int a,b;
     /*   Scanner number = new Scanner(System.in);
        System.out.println("Please enter number a: ");
        a=number.nextInt();
        System.out.println("Please enter number b: ");
        b=number.nextInt();*/
        sum = a + b;
        System.out.println(sum);
        return sum;

    }
}
