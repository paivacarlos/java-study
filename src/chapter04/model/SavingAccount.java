package chapter04.model;

public class SavingAccount extends BankAccount {

    private final double interestRate = 0.05;

    public SavingAccount(String accountNumber, String holderName, double inicialBalance) {
        super(accountNumber, holderName, inicialBalance);
    }

    public void applyInterest() {
        double actualBalance = getBalance();

        double rateDeposit = actualBalance * interestRate;

        deposit(rateDeposit);

        System.out.println("Applied interest rate: " + interestRate);
    }

    // Implementação OBRIGATÓRIA do método abstrato da classe mãe
    @Override
    public void printStatement() {
        System.out.println("\n--- Savings Account Statement ---");
        System.out.println("Holder: " + getHolderName());
        System.out.println("Real Balance: R$ " + getBalance());
        System.out.println("Interest Rate: " + interestRate);
    }

    public double getInterestRate() {
        return interestRate;
    }
}

