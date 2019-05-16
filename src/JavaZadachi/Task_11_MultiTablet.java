package JavaZadachi;

import java.util.Scanner;

public class Task_11_MultiTablet {
    public static void main(String[] args) {
        int num;
        int res;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Пожалуйста введите цифру: ");
        num = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            res = num * i;
            System.out.println(num + "*" + i + "=" + res);
        }
    }
}
