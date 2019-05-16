package JavaZadachi;

import java.util.Scanner;

public class Task_15_Konverter {
    public static void main(String[] args) {
        double kurs;
        double rub;
        double usd;

        Scanner scanner = new Scanner(System.in);
        //System.out.println("Вас приветствует онлайн конвертрер");
        System.out.println("Введите текужий курс доллара: ");
        kurs = scanner.nextDouble();
        System.out.println("Введите сумму в рублях котору вы хотите обнменять");
        rub = scanner.nextDouble();
        usd = rub / kurs;
        System.out.println("Количество долларов которое вы можете получить: " + String.valueOf(usd).substring(0, 5));

    }
}
