package chapter03;

import chapter03.model.BankAccount;
import chapter03.model.SavingsAccount;

public class MainChapter03 {
    public static void main(String[] args) {
        System.out.println("--- Chapter 3: Basic Object-Oriented Programming---");
        // Tipo       Nome da Variável = new Construtor(parâmetros);
        BankAccount account1 = new BankAccount("12345-6", "Guilherme");
        BankAccount account2 = new BankAccount("78910-1", "Maria");

        //deposito correto
        account1.deposit(500.00);

        //deposito incorreto
        account1.deposit(-50.00);

        //saque correto
        account1.withdraw(700.00);

        //saque incorreto
        account1.withdraw(200.00);

        account2.deposit(800.00);

        System.out.printf("Balance %s: %.2f%n", account1.getHolderName(), account1.getBalance());
        System.out.printf("Balance %s: %.2f%n", account2.getHolderName(), account2.getBalance());

        System.out.println();
        System.out.println("OOP - 02 ======================//==================================");

        BankAccount account3 = new BankAccount("12345-5", "Carlos Paiva", 890.50);

        System.out.printf("Balance %s: %.2f%n", account3.getHolderName(), account3.getBalance());
        System.out.println("Total accounts created: " + BankAccount.getTotalAccountCreated());

        System.out.println();
        System.out.println("oop - 03 ======================//==================================");

        SavingsAccount account4 = new SavingsAccount("10205-0", "Patricia Scalco", 100.00, 0.05);

        System.out.printf("Balance deposited %s: %.2f%n", account4.getHolderName(), account4.getBalance());
        System.out.printf("Rate: %.2f%n", account4.getInterestRate());
        System.out.println("Total accounts created: " + BankAccount.getTotalAccountCreated());
        account4.applyInterest();
        System.out.printf("Balance actual %s: %.2f%n", account4.getHolderName(), account4.getBalance());

    }
}