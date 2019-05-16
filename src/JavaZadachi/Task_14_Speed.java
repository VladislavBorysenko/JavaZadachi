package JavaZadachi;

import java.util.Scanner;

public class Task_14_Speed {
    public static void main(String[] args) {

        int distance;
        int time;
        int speed1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите расстояние в km : ");
        distance = scanner.nextInt();
        System.out.println("Введите время в часах за которое вы хотите проехать расстояние : ");
        time = scanner.nextInt();
        speed1 = distance / time;
        System.out.println("Скорорсть с которой вам надо ехать состовляет: " + speed1 + "km/h");

    }

}
