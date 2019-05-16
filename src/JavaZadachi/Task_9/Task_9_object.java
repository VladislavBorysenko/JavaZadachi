package JavaZadachi.Task_9;

public class Task_9_object {

   /*

    private int number;
    private double number2;
    String numReturn;

    public static int intOrDouble(int number) {
        // Task_9_object.intOrDouble(number);
        Scanner value = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = value.nextInt();
        System.out.println("Your number " + num + " is integer");
        return num;
    }

    public static double intOrDouble() {
        // Task_9_object.intOrDouble(number2);

        Scanner value = new Scanner(System.in);

        System.out.println("Enter number : ");
        double num2 = value.nextDouble();
        System.out.println("Your number " + num2 + " is integer");
        return num2;
    }

    */


    public static void intOrDouble(String string) {

        if (string.contains(".")) {
            System.out.println("contains dot");
            double d = Double.parseDouble(string);
            System.out.println(d + " is double");
        } else {
            System.out.println("doesn`t contain dot");
            int i = Integer.parseInt(string);
            System.out.println(i + " is integer");
        }
    }
}
