package JavaZadachi;

import java.util.Scanner;

public class Task_3_MethodAreYouYoung {


    public static void main(String[] args) {
        areYouYang();
    }

    public static String areYouYang() {
        int yang = 30;
        int old = 60;

        String userAgeString = "";
        double userAge;

        String result = null;

        Scanner age = new Scanner(System.in);
        System.out.println("Enter your age: ");

        userAgeString = age.nextLine();
        System.out.println("You entered: " + userAgeString);


        try {
            userAge = Double.parseDouble(userAgeString);

            if (userAge < yang && userAge > 0) {
                result = "Your are yang";
            } else if (userAge >= yang && userAge < old) {
                result = "Your age normal";
            } else if (userAge >= old && userAge < 200) {
                result = "Your are old";
            } else {
                result = "error";
            }
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println("contains not number");
        }

        return result;
    }
}
