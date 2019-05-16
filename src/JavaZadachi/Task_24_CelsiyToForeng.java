package JavaZadachi;

import java.util.Scanner;

public class Task_24_CelsiyToForeng {
    public static void main(String[] args) {
        double celsiy;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру в градусах Цельсия");
        celsiy = scanner.nextInt();
        forengeit(celsiy);
    }

    public static double forengeit(double celsiy) {
        double forengeit = (celsiy + 9 / 5) + 32;
        System.out.println("Температура будет ровна: " + forengeit +" Форенгетов");
        return forengeit;
    }
}
