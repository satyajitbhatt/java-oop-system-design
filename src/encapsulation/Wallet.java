package encapsulation;

import java.util.UUID;

public class Wallet {

    private final String walletId;
    private final String ownerName;
    private double balance;
    private boolean isActive;

    public Wallet(String ownerName) {
        this.walletId = UUID.randomUUID().toString();
        this.ownerName = ownerName;
        this.balance = 0;
        this.isActive = true;
    }

    public void deposit(double amount) {

        if(!isActive) {
            System.out.println("Wallet is inactive.");
            return;
        }

        if(amount <= 0) {
            System.out.println("Invalid deposit amount.");
            return;
        }

        balance += amount;
        System.out.println("Deposited : " + amount);
        System.out.println("Current Balance : " + balance);
    }

    public void withdraw(double amount) {

        if (!isActive) {
            System.out.println("Wallet is inactive.");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return;
        }

        balance -= amount;

        System.out.println("Withdrawn : " + amount);
        System.out.println("Remaining Balance : " + balance);
    }

    public void freezeWallet() {
        isActive = false;
        System.out.println("Wallet has been frozen.");
    }

    public void activateWallet() {
        isActive = true;
        System.out.println("Wallet activated.");
    }
}
