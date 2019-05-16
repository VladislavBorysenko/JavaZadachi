package JavaZadachi;

import java.util.Scanner;

public class Task_21_SquerAndPerimetr {

    public static final String LETTERS_STRING = "abcdefghigklmnopqrstuvwxyz";

    public static void main(String[] args) {

        int side;

        String question = "Если вы хотите узнать ";
        String sqr = "Площадь квадрата, введите 'S'";
        String prm = "Периметр квадрата, введите 'P'";
        String answer = "";
        String Answer2 = null;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите сторону квадрата: ");
            side = scanner.nextInt();
            Scanner strScanner = new Scanner(System.in);
            System.out.println(question + sqr + '\n' + question + prm);
            answer = strScanner.nextLine();
            System.out.println(answer);
            if (LETTERS_STRING.contains(answer) | LETTERS_STRING.toUpperCase().contains(answer)) {
                switch (answer) {
                    case "S":
                        squer(side);
                        break;
                    case "P":
                        perimetr(side);
                        break;
                    case "s":
                        System.out.println("Ошибка регистра");
                        break;
                    case "p":
                        System.out.println("Ошибка регистра");
                        break;
                    default:
                        System.out.println("Ошибка ввода операции");
                }
            } else {
                System.out.println("Ошибка ввода");

            }
            System.out.println('\n' + "Желаете повторить процедуру ?: Y/N");
            Answer2 = strScanner.nextLine();
        } while (Answer2.equals("Y"));

        System.out.println("Вы вышли из цикла");

    }

    public static int squer(int side) {
        int squer = side * side;
        System.out.println("Площадь квадрата равна: " + squer);
        return squer;
    }

    public static int perimetr(int side) {
        int perimetr = (side + side) * 2;
        System.out.println("Периметр квадрата равен: " + perimetr);
        return perimetr;
    }
}
