package chapter04.model;

public abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance = 0.0;
    private static int totalAccountCreated = 0;

    public BankAccount(String accountNumber, String holderName) {
        this(accountNumber, holderName, 0.0);
    }

    public BankAccount(String accountNumber, String holderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        if (initialBalance > 0) {
            deposit(initialBalance);
        }
        totalAccountCreated++;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successfully completed.");
        } else {
            System.out.println("The deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw successfully completed.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Método abstrato: TODAS as filhas concretas são OBRIGADAS a ter o seu próprio extrato!
    public abstract void printStatement();

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public static int getTotalAccountCreated() {
        return totalAccountCreated;
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