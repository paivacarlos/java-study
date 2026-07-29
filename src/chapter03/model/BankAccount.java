package chapter03.model;

public class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance = 0.0;
    private static int totalAccountCreated = 0;

    public BankAccount(String accountNumber, String holderName) {
        this(accountNumber, holderName, 0.0);
    }

    public BankAccount(String accountNumber, String holderName, double inicialBalance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        if (inicialBalance > 0) {
            deposit(inicialBalance);
        }

        totalAccountCreated++;
    }

    public void deposit (double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successfully completed.");
        } else {
            System.out.println("The deposit amount must be positive.");
        }
    }

    public static int getTotalAccountCreated() {
        return totalAccountCreated;
    }
    
    public void withdraw (double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw successfully completed.");
        } else if (amount <= 0 || amount > balance) {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    protected void setBalance(double balance) {
        this.balance = balance;
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
