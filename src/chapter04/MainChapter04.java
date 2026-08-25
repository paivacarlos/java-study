package chapter04;

import chapter04.contract.Taxeble;
import chapter04.exception.BusinessException;
import chapter04.model.BankAccount;
import chapter04.model.CheckingAccount;
import chapter04.model.SavingAccount;

import java.util.List;

public class MainChapter04 {

    public static void main(String[] args) {
        System.out.println("========================================================================");
        System.out.println("     CAPÍTULO 04: CLASSES ABSTRATAS, INTERFACES E EXCEÇÕES              ");
        System.out.println("========================================================================");

        // -------------------------------------------------------------------------------------
        // SEÇÃO 1: INSTANCIAÇÃO E CLASSES CONCRETAS
        // -------------------------------------------------------------------------------------
        // Nota: Tentar dar 'new BankAccount(...)' gera ERRO DE COMPILAÇÃO pois a classe é abstrata!
        CheckingAccount checkingAcc = new CheckingAccount("2001-X", "Lucas Silva", 1000.00);
        SavingAccount savingsAcc = new SavingAccount("12345-6", "Carlos Paiva", 100.00);

        System.out.println("\n--- 1. Extratos Individuais das Contas ---");
        checkingAcc.printStatement();
        savingsAcc.printStatement();

        // -------------------------------------------------------------------------------------
        // SEÇÃO 2: CONTRATO DE INTERFACE (Taxable)
        // -------------------------------------------------------------------------------------
        System.out.println("\n--- 2. Contrato de Cálculo de Imposto (Interface Taxable) ---");
        System.out.printf("Cálculo Direto de Imposto (Conta Corrente): R$ %.2f%n", checkingAcc.calculateTax());

        // Polimorfismo usando a Interface como o tipo de referência:
        Taxeble taxableItem = checkingAcc;
        System.out.printf("Imposto via Referência da Interface: R$ %.2f%n", taxableItem.calculateTax());

        // -------------------------------------------------------------------------------------
        // SEÇÃO 3: POLIMORFISMO COM STREAMS API (List<BankAccount>)
        // -------------------------------------------------------------------------------------
        System.out.println("\n--- 3. Polimorfismo via Stream API ---");
        List<BankAccount> accounts = List.of(checkingAcc, savingsAcc);

        // Iterando pela lista de referência abstrata; cada conta executa seu próprio printStatement()
        accounts.forEach(BankAccount::printStatement);

        // -------------------------------------------------------------------------------------
        // SEÇÃO 4: EXCEÇÕES DE DOMÍNIO (BusinessException)
        // -------------------------------------------------------------------------------------
        System.out.println("\n--- 4. Tratamento de Exceções (BusinessException) ---");

        // Teste 1: Saque bem-sucedido dentro do limite + taxa
        try {
            System.out.println("Tentando realizar saque válido de R$ 500.00...");
            checkingAcc.withdraw(500.00);
            System.out.printf("Novo Saldo após o saque: R$ %.2f%n", checkingAcc.getBalance());
        } catch (BusinessException e) {
            System.out.println("Violação de regra de negócio: " + e.getMessage());
        }

        // Teste 2: Saque inválido excedendo o limite do cheque especial (Dispara a Exceção)
        try {
            System.out.println("\nTentando realizar saque inválido de R$ 10.000,00...");
            checkingAcc.withdraw(10000.00);
        } catch (BusinessException e) {
            System.out.println("Violação de regra de negócio: " + e.getMessage());
        }

        // -------------------------------------------------------------------------------------
        // TESTES DE VALIDAÇÃO FAIL-FAST (CONSTRUTOR E DEPÓSITO)
        // -------------------------------------------------------------------------------------
                System.out.println("\n--- 5. Testes de Blindagem Fail-Fast ---");

        // Cenário 1: Titular com texto em branco
                try {
                    System.out.println("Tentativa 1: Criando conta com titular em branco...");
                    CheckingAccount invalidHolder = new CheckingAccount("1001-A", "   ", 100.0);
                } catch (BusinessException e) {
                    System.out.println("Erro Capturado: " + e.getMessage());
                }

        // Cenário 2: Saldo inicial negativo
                try {
                    System.out.println("\nTentativa 2: Criando conta com saldo inicial negativo...");
                    CheckingAccount invalidBalance = new CheckingAccount("1002-B", "Carlos", -50.0);
                } catch (BusinessException e) {
                    System.out.println("Erro Capturado: " + e.getMessage());
                }

        // Cenário 3: Depósito com valor inválido
                try {
                    System.out.println("\nTentativa 3: Realizando depósito com valor zero ou negativo...");
                    checkingAcc.deposit(-20.0);
                } catch (BusinessException e) {
                    System.out.println("Erro Capturado: " + e.getMessage());
                }

        System.out.println("\n========================================================================");
        System.out.println("                   EXECUÇÃO DO CAPÍTULO 04 CONCLUÍDA                    ");
        System.out.println("========================================================================");
    }
}