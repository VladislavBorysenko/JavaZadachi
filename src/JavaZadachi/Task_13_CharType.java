package JavaZadachi;

import java.util.Scanner;

public class Task_13_CharType {

    public static final String NUMBERS_STRING = "0123456789";
    public static final String LETTERS_STRING = "abcdefghigklmnopqrstuvwxyz";
    public static final String SIGN_STRING = ".,?!:-...";


    public static void main(String[] args) {

        String symbol;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите один символ:");
        symbol = scanner.nextLine();

        if (NUMBERS_STRING.contains(symbol)) {
            System.out.println(symbol + " is a number");
        } else if (LETTERS_STRING.contains(symbol) | LETTERS_STRING.toUpperCase().contains(symbol)) {
            System.out.println(symbol + " is a letter");
        } else if (SIGN_STRING.contains(symbol)) {
            System.out.println(symbol + " is a sign");
        } else {
            System.out.println(symbol + " is a unknown!");
        }
    }
}
