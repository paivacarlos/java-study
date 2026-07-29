package chapter03.model;

public class CheckingAccount extends BankAccount{

    private final double overdraftLimit = 500.00;

    public CheckingAccount(String accountNumber, String holderName, double inicialBalance) {
        super(accountNumber, holderName, inicialBalance);
    }

    @Override
    public void withdraw(double amount) {
        double withdrawTax = 2.00;
        double totalDebit = amount + withdrawTax;

        double totalAvailable = super.getBalance() + overdraftLimit;

        if(amount > 0 && totalDebit <= totalAvailable) {
            setBalance(getBalance() - totalDebit);
            System.out.println("Withdraw successfully completed.");

        } else {
            System.out.println("Insufficient balance and overdraft limit.");
        }

    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public double getTotalAvailableBalance() {
        return super.getBalance() + overdraftLimit;
    }

}
