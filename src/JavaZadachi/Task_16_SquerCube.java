package JavaZadachi;

import java.util.Scanner;

public class Task_16_SquerCube {

    public static final String NUMBERS_STRING = "0123456789";

    public static void main(String[] args) {
        String number;
        String step;
        double num;
        double res = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        number = scanner.nextLine();
        System.out.println("Введите степень в которую хотите возвести : " + number);
        step = scanner.nextLine();

        if (NUMBERS_STRING.contains(number) && NUMBERS_STRING.contains(step)) {
            double numb = Double.parseDouble(number);
            double stepen = Double.parseDouble(step);

            System.out.println("###############################");
            res = myPower(numb, stepen);
            System.out.println("res=" + res);
            System.out.println("###############################");



          /*  for (int i = 2; i <=3 ; i++) {

               numb*=numb ;
                System.out.println(numb);
            }*/
            System.out.println("-----------------------------------------------------------");

            res = Math.pow(numb, stepen);
            System.out.println(res);
        } else {
            System.out.println("Вы ввели недопустимое значение! " + number + " или " + step);
        }

    }


    public static double myPower(double numb, double stepen) {
        double result = 1;
        double factor = numb;

        for (int i = 0; i < stepen; i++) {
            result *= factor;
        }
        System.out.println("Result: " + numb + " in " + stepen + " power = " + result);
        return result;
    }
}
