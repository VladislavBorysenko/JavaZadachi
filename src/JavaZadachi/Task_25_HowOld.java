package JavaZadachi;

import java.util.Scanner;

public class Task_25_HowOld {
    public static void main(String[] args) {
        int age;
        int ageDay;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите свой возраст:");
        age =scanner.nextInt();
        ageDay = (age*12)*30;
        System.out.println("Ваш возраст в днях будет равен: "+ageDay);
    }
}
