package JavaZadachi;

import java.util.Scanner;

public class Task_10_HowMatch {
    public static void main(String[] args) {
        howmatch();


    }

    public static double howmatch() {
        double payAtHour;
        double hourInDay;
        final int NUMBER_OF_DAYS_IN_WEEK =5;
        double payAtMounth = 0;
        double overTime = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите зарплату за час");
        payAtHour = scanner.nextInt();
        System.out.println("Введите количество отработанных часов вдень");
        hourInDay = scanner.nextInt();
        //------------------------------------------------------------------------------------------//
        if (payAtHour > 5) {
            System.out.println("Вы не можете получать больше 5 долларов в час");
        } else if ((hourInDay * NUMBER_OF_DAYS_IN_WEEK) > 60) {
            System.out.println("Вы не можете работать больше 60 часов в неделю");
        } else if ((hourInDay * NUMBER_OF_DAYS_IN_WEEK) > 40) {
            overTime = ((hourInDay * NUMBER_OF_DAYS_IN_WEEK) - 40) * 1.5;
            payAtMounth = ((overTime * 4) + (40 * 4)) * payAtHour;

        }else{
            overTime = 0;
            payAtMounth = ((overTime * 4) + (hourInDay*NUMBER_OF_DAYS_IN_WEEK * 4)) * payAtHour;
        }

        System.out.println("Ваша заробатная плата за месяц сосотовляет: " + payAtMounth + "$");

        return payAtMounth;
    }

}

