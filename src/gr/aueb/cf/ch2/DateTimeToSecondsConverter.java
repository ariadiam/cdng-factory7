package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Μετατρέπει ημέρες, ώρες, λεπτά, δευτερόλεπτα,
 * σε συνολικά δευτερόλεπτα. Ο χρήστης δίνει τα
 * δεδομένα και εκτυπώνεται το τελικό αποτέλεσμα.
 */

public class DateTimeToSecondsConverter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int days = 0;
        int hours = 0;
        int minutes = 0;
        int seconds = 0;

        System.out.println("Please write the number of days");
        days = in.nextInt();
        System.out.println("Please write the number of hours");
        hours = in.nextInt();
        System.out.println("Please write the number of minutes");
        minutes = in.nextInt();
        System.out.println("Please write the number of seconds");
        seconds = in.nextInt();
    }
}
