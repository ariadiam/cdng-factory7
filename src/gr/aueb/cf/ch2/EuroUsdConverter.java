package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Μετατρέπει Ευρώ σε USD και cents.
 * Η ισοτιμία 99 cents = 1 Ευρώ
 */
public class EuroUsdConverter {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int inputEuro = 0;
        int totalUsaCents = 0;
        int usaDollars = 0;
        int usaCents = 0;
        final int PARITY = 99;

        // Εντολές
        System.out.println("Please insert an integer amount (Euro)");
        inputEuro = in.nextInt();

        totalUsaCents = inputEuro * PARITY;
        usaDollars = totalUsaCents / 100;
        usaCents = totalUsaCents % 100;

        System.out.printf("%d euros = %d usa dollars , %d usa cents", inputEuro, usaDollars, usaCents);
    }
}
