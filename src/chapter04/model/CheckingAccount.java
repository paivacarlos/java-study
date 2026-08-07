package chapter04.model;

import chapter04.contract.Taxeble;

public class CheckingAccount extends BankAccount implements Taxeble{

    private final double overdraftLimit = 500.00;

    public CheckingAccount(String accountNumber, String holderName, double initialBalance) {
        super(accountNumber, holderName, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        double withdrawTax = 2.00;
        double totalDebit = amount + withdrawTax;
        double totalAvailable = getBalance() + overdraftLimit;

        if (amount > 0 && totalDebit <= totalAvailable) {
            setBalance(getBalance() - totalDebit);
            System.out.println("Withdraw successfully completed.");
        } else {
            System.out.println("Insufficient balance and overdraft limit.");
        }
    }

    // Implementação OBRIGATÓRIA do método abstrato da classe mãe
    @Override
    public void printStatement() {
        System.out.println("\n--- Checking Account Statement ---");
        System.out.println("Holder: " + getHolderName());
        System.out.println("Real Balance: R$ " + getBalance());
        System.out.println("Overdraft Limit: R$ " + overdraftLimit);
        System.out.println("Total Available: R$ " + (getBalance() + overdraftLimit));
    }

    // Implementação OBRIGATÓRIA do contrato da Interface Taxable
    @Override
    public double calculateTax() {
        // Regra de negócio: Imposto de 1% sobre o saldo real atual
        return getBalance() * 0.01;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}
