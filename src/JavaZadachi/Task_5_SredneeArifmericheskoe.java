package JavaZadachi;

public class Task_5_SredneeArifmericheskoe {
    public static void main(String[] args) {

        double sumArr = 0;
        double srednee = 0;
        //заполняем
        int[] arr = new int[50];     //{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50};
        for (int j = 0; j < 50; j++) {
            arr[j] = j + 1;
        }
        for (int i = 0; i < arr.length; i++) { //
            sumArr += arr[i];

            srednee = sumArr / arr.length;
            System.out.println(srednee);
        }
        srednee = sumArr / arr.length;
        System.out.println(srednee);
    }
}
