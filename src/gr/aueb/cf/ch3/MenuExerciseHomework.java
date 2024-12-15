package gr.aueb.cf.ch3;

import java.util.Scanner;

public class MenuExerciseHomework {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Please choose one of the following: ");
            System.out.println("1.Εισαγωγή");
            System.out.println("2.Διαγραφή");
            System.out.println("3.Ενημέρωση");
            System.out.println("4.Αναζήτηση");
            System.out.println("5.Έξοδος");
            System.out.println("Please insert your choice");
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Insert all");
                    break;
                case 2:
                    System.out.println("Delete all");
                    break;
                case 3:
                    System.out.println("Update all");
                    break;
                case 4:
                    System.out.println("Search beginning...");
                    break;
                case 5:
                    System.out.println("Quitting...");
                    break;
                default:
                    System.out.println("Error in choice");
                    break;
            }
        } while (choice != 5);

        System.out.println("Thank you for using the menu app.");
    }
}
