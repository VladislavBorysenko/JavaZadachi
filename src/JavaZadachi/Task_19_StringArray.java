package JavaZadachi;

import java.util.Arrays;
import java.util.Scanner;

public class Task_19_StringArray {
    public static void main(String[] args) {

        String text;
        String a = " ";


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст");
        text = scanner.nextLine();

        String[] strWords = text.split(" ");
        System.out.println(Arrays.toString(strWords));
        int elementMax = 0;

        /*
        for (int i = 0; i < strWords.length; i++) {
            for (int j = 0; j < strWords.length; j++) {
                if (strWords[i].length() < strWords[j].length()) {
                    a = strWords[j];
                    elementMax = j;
                }
            }
        }
        */

        a = strWords[0];
        elementMax = 0;
        for (int i = 0; i < strWords.length; i++) {
            if (a.length() < strWords[i].length()) {
                a = strWords[i];
                elementMax = i;
            }
        }
        System.out.println(elementMax + "|" + a);


    }
}
