package JavaZadachi;

public class Task_19_StringArray_0 {

    public static String[] stringArray = {"aaa", "bb", "CCCCC", "dd"};

    public static void main(String[] args) {

        for (int i = 0; i < stringArray.length; i++) {
            System.out.println("stringArray[" + i + "]=" + stringArray[i] + " | length=" + stringArray[i].length());
        }

    }
}
