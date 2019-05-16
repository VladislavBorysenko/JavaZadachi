package JavaZadachi.Task_9;

import java.util.Scanner;

import static JavaZadachi.Task_9.Task_9_object.intOrDouble;

public class Task_9_ProverkaIntOrDouble {
    public static void main(String[] args) {


        Scanner value = new Scanner(System.in);
        System.out.println("Enter number : ");
        String string = value.nextLine();

        intOrDouble(string);

    }
}
