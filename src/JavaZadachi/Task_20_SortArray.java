package JavaZadachi;

import java.util.Arrays;
import java.util.Scanner;

public class Task_20_SortArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 0 значение массива");
        arr[0] = scanner.nextInt();
        System.out.println("Введите 1 значение массива");
        arr[1] = scanner.nextInt();
        System.out.println("Введите 2 значение массива");
        arr[2] = scanner.nextInt();
        System.out.println("Введите 3 значение массива");
        arr[3] = scanner.nextInt();
        System.out.println("Введите 4 значение массива");
        arr[4] = scanner.nextInt();
        System.out.println("Вы заполнили массив");


       // Arrays.toString(arr);

        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr);
            System.out.println(arr[i]);


        }
    }
}