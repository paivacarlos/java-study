package chapter03.model;

public class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance = 0.0;

    public BankAccount(String accountNumber, String holderName) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
    }

    public void deposit (double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successfully completed.");
        } else {
            System.out.println("The deposit amount must be positive.");
        }
    }
    
    public void withdraw (double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw successfully completed.");
        } else if (amount <= 0 || amount > balance) {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }
    
    public double getBalance() {
        return balance;
    }
}
