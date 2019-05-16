package JavaZadachi;

import java.util.Scanner;

public class Task_23_Trigon {
    public static void main(String[] args) {

        double sideA;
        double sideB;

        String numOfShoise;

        Scanner scanner = new Scanner(System.in);
        Scanner scann = new Scanner(System.in);

        System.out.print("Введите катет  а: ");
        sideA = scanner.nextInt();
        System.out.print("Введите катет  b: ");
        sideB = scanner.nextInt();

        System.out.println("Если вы хотите посчитать площадь, введите 1");
        System.out.println("Если вы хотите посчитать периметр, введите 2");
        System.out.println("Если вы хотите посчитать гепотенузу, введите 3");
        numOfShoise = scann.nextLine();

        switch (numOfShoise) {
            case "1":
                squer(sideA, sideB);
                break;
            case "2":
                perimetr(sideA, sideB);
                break;
            case "3":
                sideC(sideA, sideB);
                break;
            default:
                System.out.println("Вы ввели не правельное значение. Программа будет закрыта!!!");
        }


    }

    public static double squer(double sideA, double sideB) {
        double squer = (sideA * sideB) / 2;
        System.out.println("Площадь  треугольника равна: " + squer);
        return squer;
    }

    public static double sideC(double sideA, double sideB) {
        double sideC = (sideA * sideA) + (sideB * sideB);
        sideC = Math.sqrt(sideC);
        System.out.println("Гепотинуза треугольника равна: " + String.valueOf(sideC).substring(0, 3));
        return sideC;
    }

    public static double perimetr(double sideA, double sideB) {
        double sideC = (sideA * sideA) + (sideB * sideB);
        sideC = Math.sqrt(sideC);
        double perimetr = sideA + sideB + sideC;
        System.out.println("Перимeтр треугольника равен: " + String.valueOf(perimetr).substring(0, 3));
        return perimetr;
    }


}
