package gr.aueb.cf.ch5;

import java.util.Scanner;

public class MenuApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            printMenu();
            choice = scanner.nextInt();

            if (!isChoiceValid(choice)) {
                System.out.println("Error. Choice not valid.");
                continue;
            }

            doOnChoice(choice);
        } while (choice != 5);
    }

    public static void printMenu() {
        System.out.println("Please choose one of the following");
        System.out.println("1.");
        System.out.println("2.");
        System.out.println("3.");
        System.out.println("4.");
        System.out.println("5.");
    }

    public static boolean isChoiceValid(int choice) {
        return choice >= 1 && choice <= 5;
    }

    public static void doOnChoice(int choice) {

        switch (choice) {
            case 1:
                System.out.println("Εισαγωγή Process");
                break;
            case 2:
                System.out.println("Διαγραφή Process");
                break;
            case 3:
                System.out.println("Αναζήτηση Process");
                break;
            case 4:
                System.out.println("Ενημέρωση Process");
                break;
            case 5:
                System.out.println("Έξοδος");
                break;
            default:
                System.out.println("Wrong choice");
                break;
        }
    }
}
