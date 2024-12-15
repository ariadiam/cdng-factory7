package gr.aueb.cf.ch2;

import java.math.BigInteger;

/**
 * BigInteger class demo
 */

public class BigIntApp {

    public static void main(String[] args) {
        // Declarations and Initializations
        BigInteger bigNum1 = new BigInteger("12345438358432843");
        BigInteger bigNum2 = new BigInteger("484215554849734842");
        BigInteger result;

        // Commands
        result = bigNum1.add(bigNum2);

        // Printing the results
        System.out.printf("%,d", result);
    }
}
