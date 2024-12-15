package gr.aueb.cf.ch4;

import java.util.Scanner;

public class StarsHomework {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int inputNum = 0;
//
//        System.out.println("Please insert the number of stars");
//        inputNum = scanner.nextInt();
//
//        for (int i = 0; i < inputNum; i++) {
//            System.out.print("*");
//        }
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;

        System.out.println("Please insert the number of stars");
        inputNum = scanner.nextInt();

        for (int i = 1; i <= inputNum; i++) {
            for (int j= 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


