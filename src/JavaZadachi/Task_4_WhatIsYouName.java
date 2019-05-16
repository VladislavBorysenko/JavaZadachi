package JavaZadachi;

import java.util.Scanner;

public class Task_4_WhatIsYouName {

    public static void main(String[] args) {
        youname();
    }

    public static String youname() {
        String userName = null;
        Scanner name = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        userName = name.nextLine();
        System.out.println("your name is " + userName);
        return userName;
    }
}
