package hw5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StoreValueCard card = new StoreValueCard("ntunhs001", 1000, 0);
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Add Value");
            System.out.println("2. Charge");
            System.out.println("3. Exchange Bonus");
            System.out.println("4. Print Details");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to add: ");
                    double addAmount = scanner.nextDouble();
                    card.addValue(addAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to charge: ");
                    double chargeAmount = scanner.nextDouble();
                    card.charge(chargeAmount);
                    break;
                case 3:
                    System.out.print("Enter bonus to exchange: ");
                    int bonusToExchange = scanner.nextInt();
                    card.exchangeBonus(bonusToExchange);
                    break;
                case 4:
                    card.printDetails();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }
}
