package JavaZadachi;

import java.util.Scanner;

public class Task_18_TriChisla {
    static double first;
    static double second;
    static double third;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        first = scanner.nextDouble();
        System.out.println("Введите первое число: ");
        second = scanner.nextDouble();
        System.out.println("Введите первое число: ");
        third = scanner.nextDouble();
        srednee(first, second, third);
        raznost(first, second, third);
    }

    public static double srednee(double first, double second, double third) {
        double srednee = first + second + third;
        srednee = srednee / 3;
        System.out.println("Среденее арифметическое равно: " + srednee);

        return srednee;

    }

    public static double raznost(double first, double second, double third) {
        double raznost = (first + third) * 2 - second * 3;
        System.out.println("Разность чисел равна : " + raznost);
        return raznost;
    }
}
