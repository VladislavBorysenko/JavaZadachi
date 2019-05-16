package JavaZadachi;

import java.util.Scanner;

public class Task_12_24Hours {
    public static void main(String[] args) {
        int day;
        int hours;
        int minutes;
        int seconds;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество суток");
        day = scanner.nextInt();
        hours = day * 24;
        minutes = hours * 60;
        seconds = minutes * 60;
        System.out.println("В " + day + " Сутках: " + hours + " часов или " + minutes + " минут или " + seconds + " секунд");


    }
}
