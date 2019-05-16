package JavaZadachi;

import java.util.Arrays;

public class Task_8_MinMaxArrayNumber {
    public static void main(String[] args) {
        int[] array = {1, 85, 8, 9, 9, 4, 5, -12};

        System.out.println("Array:" + Arrays.toString(array));

        int minimum = 0;
        for (int i = 0; i < array.length; i++) {
            if (minimum > array[i]) {
                minimum = array[i];
            }
        }
        System.out.println("MIN value=" + minimum);


        int maximum = 0;
        for (int i = 0; i < array.length; i++) {
            if (maximum < array[i]) {
                maximum = array[i];
            }
        }
        System.out.println("MAX value=" + maximum);
    }
}
