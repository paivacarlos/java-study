package chapter04;

import chapter04.contract.Taxeble;
import chapter04.model.BankAccount;
import chapter04.model.CheckingAccount;

public class MainChapter04 {
    public static void main(String[] args) {
        System.out.println("--- Chapter 4: Abstract Classes and Interfaces ---");

        // 1. Tentar dar 'new BankAccount(...)' gera ERRO DE COMPILAÇÃO!
        // BankAccount acc = new BankAccount("101", "Erro"); // ❌ Proibido por ser abstract!

        // 2. Instanciando uma CheckingAccount (concreta)
        CheckingAccount checkingAcc = new CheckingAccount("2001-X", "Lucas Silva", 1000.00);

        // 3. Testando o método abstrato herdado
        checkingAcc.printStatement();

        // 4. Testando o contrato da Interface Taxable
        System.out.printf("Calculated Tax (1%%): R$ %.2f%n", checkingAcc.calculateTax());

        // 5. Polimorfismo usando a Interface como Tipo da referência
        Taxeble taxableItem = checkingAcc; // Programar voltado para a Interface!
        System.out.printf("Tax via Interface Reference: R$ %.2f%n", taxableItem.calculateTax());
    }
}