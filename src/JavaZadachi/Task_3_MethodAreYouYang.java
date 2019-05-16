package JavaZadachi;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Task_3_MethodAreYouYang {

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


        // String to be scanned to find the pattern.
        String line = userAgeString;
        String pattern = "[^0-9.]";
        String pattern2 = "\\.{2,}";


        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);
        Pattern r2 = Pattern.compile(pattern2);

        // Now create matcher object.
        Matcher m = r.matcher(line);
        Matcher m2 = r2.matcher(line);

        if (m.find()) {
            System.out.println("contains not number");
        } else {
            if (!m2.find()) {
                try {
                    userAge = Double.parseDouble(userAgeString);
                    System.out.println(userAge);

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
                }
                catch (NumberFormatException e){
                    System.out.println("contains not number");
                }
            }else{
                System.out.println("contains not number");
            }
        }

        return result;
    }

}
