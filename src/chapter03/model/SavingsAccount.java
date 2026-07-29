package chapter03.model;

public class SavingsAccount extends BankAccount {

    private final double interestRate;

    public SavingsAccount(String accountNumber, String holderName, double inicialBalance, double interestRate) {
        super(accountNumber, holderName, inicialBalance);

        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double actualBalance = getBalance();

        double rateDeposit = actualBalance * interestRate;

        deposit(rateDeposit);

        System.out.println("Applied interest rate: " + interestRate);
    }

    public double getInterestRate() {
        return interestRate;
    }
}
