package gr.aueb.cf.ch5;

import java.util.Scanner;

public class FindMaxAppHw {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int num1 = 0;
//        int num2= 0;
//        int num3 = 0;
//
//        System.out.println("Please enter the first number");
//        num1 = scanner.nextInt();
//        System.out.println("Please insert the second number");
//        num2 = scanner.nextInt();
//        System.out.println("Please insert the third number");
//        num3 = scanner.nextInt();
//
//
//        int temp = Math.max(num1, num2);
//        int max = Math.max(num3, temp);
//
//        System.out.println("The largest number is: " + max);

//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        System.out.println("Please enter the first number");
        num1 = scanner.nextInt();
        System.out.println("Please insert the second number");
        num2 = scanner.nextInt();
        System.out.println("Please insert the third number");
        num3 = scanner.nextInt();

//        findMax(num1, num2, num3);
        System.out.println("The biggest number is: " + findMax(num1, num2, num3));
    }
        public static int findMax(int num1, int num2, int num3) {
            return Math.max(num1, Math.max(num2, num3));
        }
    }


