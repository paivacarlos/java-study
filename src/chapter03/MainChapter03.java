package chapter03;

import chapter03.model.BankAccount;

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

    }
}