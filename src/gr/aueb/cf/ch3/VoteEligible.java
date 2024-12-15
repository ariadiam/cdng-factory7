package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * The right to vote, ages > 18
 * Checks if an age has the right to vote.
 */
public class VoteEligible {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MIN_AGE = 18;
        int inputNum = 0;
        boolean canVote = false;

        System.out.println("Please insert the age");
        inputNum = scanner.nextInt();

        canVote = inputNum >= MIN_AGE;

        System.out.println("You can vote: " + canVote);

    }
}
