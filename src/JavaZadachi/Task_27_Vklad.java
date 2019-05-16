package JavaZadachi;

public class Task_27_Vklad {
    public static void main(String[] args) {
        double sum;
        double stavka;

        sum = 1000;
        stavka = 0.10;


    /*    sum=sum+(sum*stavka);
        sum=sum+(sum*stavka);
        sum=sum+(sum*stavka);
        sum=sum+(sum*stavka);
        sum=sum+(sum*stavka);
        System.out.println(sum);
        System.out.println("-----------------------");*/

        for (int i = 0; i < 5; i++) {
            sum = sum + (sum * stavka);
            System.out.println(sum);
        }
    }
}
