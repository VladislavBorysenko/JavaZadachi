package JavaZadachi;

import java.util.Scanner;

public class Task_6_PrintChar {
//Вводим строки и разбиваем ее на массив элементов. Если количество элементов больше одного,
    //тогда просим повторить ввод.

    public static void main(String[] args) {
        String getChar;
        Scanner getCR = new Scanner(System.in);//имя переменной должно информативным scanner


        while (true) {

            char element = ' ';
            int numberElement = 0;

            System.out.println("Please enter CHAR ");
            getChar = getCR.nextLine();

            char[] charArray = getChar.toCharArray();

            for (int i = 0; i < charArray.length; i++) {
                numberElement = i;
                element = charArray[i];
            }
            if (numberElement == 0) {
                System.out.println("Your CHAR is: " + '"' + element + '"');
                break;

            } else if (numberElement != 0) {
                continue;
            }
        }
    }
}




