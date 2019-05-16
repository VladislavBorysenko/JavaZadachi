package JavaZadachi;

import java.util.Scanner;

public class Task_17_ThreeNumbers {
    public static void main(String[] args) {
        int one;
        int two;
        int three;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число : ");
        one = scanner.nextInt();
        System.out.println("Введите второе число : ");
        two = scanner.nextInt();
        System.out.println("Введите третье число : ");
        three = scanner.nextInt();

        one = one * 2;
        System.out.println(one);
        two = two - 3;
        System.out.println(two);
        three *= three;
        System.out.println(three);

        int res = one + two + three;
        System.out.println("Результат будет равен: " + res);
    }
}
