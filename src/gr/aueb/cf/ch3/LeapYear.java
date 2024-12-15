package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * year % 4 && % 100 == Not Leap
 * year % 400 == 0 Leap
 * year % 4 || % 400 == 0 Leap
 * year % 4 && %100 && %400 == 0 Leap
 */
public class LeapYear {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isLeap = false;
        int year = 0;

        System.out.println("Please insert the year");
        year = in.nextInt();

        isLeap = (year % 400 == 0) || ((year % 4 == 0) && (year % 100 !=0));

        System.out.println("The year is leap: " + isLeap);

    }
}
