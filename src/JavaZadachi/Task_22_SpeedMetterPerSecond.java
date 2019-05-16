package JavaZadachi;

import java.util.Scanner;

public class Task_22_SpeedMetterPerSecond {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int time;
        int distance;

        System.out.print("Введите растояние в km: ");
        distance = scanner.nextInt();
        System.out.print("Введите время в мин.: ");
        time = scanner.nextInt();

        speed(time,distance);
    }

    public static int speed(int time, int distance) {
        int minute = 60;
        int km = 1000;
        int speed = (distance * km) / (time * minute);
        System.out.println("Ваша скорость составит: "+speed+" м/сек.");
        return speed;
    }
}
