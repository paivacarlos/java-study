import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExerciseStreams {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n========================================");
            System.out.println("   STREAMS API CHALLENGES - MENU        ");
            System.out.println("========================================");
            System.out.println("1  - Exercise 01: Even Numbers Filter");
            System.out.println("2  - Exercise 02: Uppercase Names Converter");
            System.out.println("3  - Exercise 03: Square Numbers Map");
            System.out.println("4  - Exercise 04: Filter Names by Length");
            System.out.println("5  - Exercise 05: Product Price Increase");
            System.out.println("6  - Exercise 06: Filter and Double Numbers");
            System.out.println("7  - Exercise 07: Extract Email Domains");
            System.out.println("8  - Exercise 08: Filter VIP Customers");
            System.out.println("9  - Exercise 09: Approved Students Filter");
            System.out.println("10 - Exercise 10: Format Currency List");
            System.out.println("0  - Exit");
            System.out.print("Choose an option: ");
            option = reader.nextInt();
            reader.nextLine(); // Limpa o buffer do teclado para evitar bugs no nextLine()

            switch (option) {
                case 1:
                    System.out.println("\n--- Running Exercise 01 ---");
                    // TODO [PT-BR]: Crie uma lista estática de números inteiros de 1 a 10.
                    // Use a Streams API com '.filter()' para coletar apenas os números pares e exiba o resultado.

                    List<Integer> listOfNumbers = List.of(1, 2, 3, 4, 5 ,6 ,7, 8, 9, 10);

                    System.out.print("Even numbers: ");

                    listOfNumbers.stream()
                            .filter(number -> number % 2 == 0)
                            .forEach(number -> System.out.printf("%d ", number));

                    System.out.println();

                    break;

                case 2:
                    System.out.println("\n--- Running Exercise 02 ---");
                    // TODO [PT-BR]: Crie uma lista com 4 nomes informados pelo usuário via Scanner.
                    // Use '.map()' para transformar todos os nomes para LETRAS MAIÚSCULAS e exiba-os com o '.forEach()'.

                    reader.nextLine();

                    ArrayList<String> namesFromInput = new ArrayList<>();

                    for (int i = 0; i < 3; i++) {
                        System.out.println("Digit the name: ");
                        String nameOfInput = reader.nextLine();

                        namesFromInput.add(nameOfInput);
                    }

                    namesFromInput.stream()
                            .map(String::toUpperCase)
                            .forEach(name -> System.out.println("Digited name in UpperCase: " + name));

                    break;

                case 3:
                    System.out.println("\n--- Running Exercise 03 ---");
                    // TODO [PT-BR]: Crie uma lista de números inteiros (ex: 2, 3, 4, 5).
                    // Use '.map()' para calcular o quadrado de cada número (número * número) e exiba a nova lista.
                    break;

                case 4:
                    System.out.println("\n--- Running Exercise 04 ---");
                    // TODO [PT-BR]: Crie uma lista de Strings com vários nomes de frutas.
                    // Use '.filter()' para manter apenas as frutas que têm mais de 5 letras. Exiba o resultado.
                    break;

                case 5:
                    System.out.println("\n--- Running Exercise 05 ---");
                    // TODO [PT-BR]: Crie uma lista de preços (double) informados pelo usuário (digite 0 para parar).
                    // Use '.map()' para aplicar um desconto de 15% em todos os preços e exiba os novos valores formatados com 'printf' (%.2f).
                    break;

                case 6:
                    System.out.println("\n--- Running Exercise 06 ---");
                    // TODO [PT-BR]: O COMBO: Crie uma lista de números de 1 a 15.
                    // Use '.filter()' para pegar apenas os ímpares E DEPOIS use '.map()' para multiplicar esses ímpares por 10.
                    // Salve em uma nova lista usando '.toList()' e exiba.
                    break;

                case 7:
                    System.out.println("\n--- Running Exercise 07 ---");
                    // TODO [PT-BR]: Crie uma lista de e-mails fictícios (ex: user1@gmail.com, user2@yahoo.com).
                    // Use '.map()' para extrair apenas o domínio dos e-mails (dica: use o método '.substring()' ou '.split("@")' da String).
                    // Exiba a lista com os domínios.
                    break;

                case 8:
                    System.out.println("\n--- Running Exercise 08 ---");
                    // TODO [PT-BR]: Simule um sistema de e-commerce. Crie uma lista com saldos de compras de clientes (double).
                    // Use '.filter()' para manter apenas os clientes "VIP" (aqueles que gastaram mais de R$ 500.00).
                    // Exiba a lista filtrada pulando linhas com '%n'.
                    break;

                case 9:
                    System.out.println("\n--- Running Exercise 09 ---");
                    // TODO [PT-BR]: Peça as notas finais de 5 alunos.
                    // Use '.filter()' para capturar apenas as notas maiores ou iguais a 7.0 (Aprovados).
                    // No final da Stream, em vez de '.toList()', use a operação terminal '.count()' para exibir QUANTOS alunos foram aprovados.
                    break;

                case 10:
                    System.out.println("\n--- Running Exercise 10 ---");
                    // TODO [PT-BR]: Crie uma lista com valores numéricos double.
                    // Use '.map()' para transformar cada número em uma String formatada como moeda americana (ex: "USD 10.50").
                    // Salve em uma lista de Strings e exiba o resultado.
                    break;

                case 0:
                    System.out.println("Exiting the program... Goodbye! ☕");
                    break;

                default:
                    System.out.println("Invalid option! Try again.");
            }
        } while (option != 0);

        reader.close();
    }
}