package hw5;

import java.util.Scanner;

public class StoreValueCard {
    private String cardId;
    private double balance;
    private int bonus;
    private static int totalCardNum = 0;

    // Constructor
    public StoreValueCard(String cardId, double balance, int bonus) {
        this.cardId = cardId;
        this.balance = balance;
        this.bonus = bonus;
        totalCardNum++;
    }

    // Getter methods
    public String getCardId() {
        return cardId;
    }

    public double getBalance() {
        return balance;
    }

    public int getBonus() {
        return bonus;
    }

    // Method to add value
    public void addValue(double amount) {
        balance += amount;
    }

    // Method to charge
    public void charge(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Method to exchange bonus
    public void exchangeBonus(int bonusToExchange) {
        if (bonus >= bonusToExchange) {
            bonus -= bonusToExchange;
            balance += bonusToExchange * 0.1; // Assume 1 bonus point can exchange for 0.1 unit of value
        } else {
            System.out.println("Insufficient bonus.");
        }
    }

    // Method to print details
    public void printDetails() {
        System.out.println("Card ID: " + cardId);
        System.out.println("Balance: " + balance);
        System.out.println("Bonus: " + bonus);
    }

    // Static method to get total card number
    public static int getTotalCardNum() {
        return totalCardNum;
    }
}

