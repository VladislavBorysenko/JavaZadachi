package JavaZadachi;

import java.util.Scanner;

public class Task_10_HowMuch_2 {

    static final int NUMBER_OF_DAYS_IN_WEEK = 5;

    static double payAtHour;
    static double hourInDay;
    static double payAtMounth = 0;
    static double overTime = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите зарплату за час");
        payAtHour = scanner.nextInt();
        System.out.println("Введите количество отработанных часов вдень");
        hourInDay = scanner.nextInt();

        howmatch(payAtHour, hourInDay);
    }


    public static double howmatch(double payAtHour, double hourInDay) {

        if (payAtHour > 5) {
            System.out.println("Вы не можете получать больше 5 долларов в час");
        } else if ((hourInDay * NUMBER_OF_DAYS_IN_WEEK) > 60) {
            System.out.println("Вы не можете работать больше 60 часов в неделю");
        } else if ((hourInDay * NUMBER_OF_DAYS_IN_WEEK) > 40) {
            overTime = ((hourInDay * NUMBER_OF_DAYS_IN_WEEK) - 40) * 1.5;
            payAtMounth = ((overTime * 4) + (40 * 4)) * payAtHour;

        } else {
            overTime = 0;
            payAtMounth = ((overTime * 4) + (hourInDay * NUMBER_OF_DAYS_IN_WEEK * 4)) * payAtHour;
        }

        System.out.println("Ваша заробатная плата за месяц сосотовляет: " + payAtMounth + "$");
        return payAtMounth;
    }
}
