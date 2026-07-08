import java.util.Scanner;

public class ExerciseLoops {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n--- MENU DE LAÇOS DE REPETIÇÃO ---");
            System.out.println("1 - O Contador Regressivo (while)");
            System.out.println("2 - A Tabuada (for)");
            System.out.println("3 - O Somador de Notas (do-while)");
            System.out.println("0  - Sair");
            System.out.print("Escolha o exercício: ");
            option = reader.nextInt();

            switch (option) {
                case 1:
                    System.out.println("\n--- Exercício 14: Contador Regressivo ---");
                    // TODO: Peça um número inteiro positivo.
                    // TODO: Usando 'while', conte de forma regressiva até 0.

                    System.out.println("Digit integer value: ");
                    int valueInput = reader.nextInt();

                    while (valueInput >= 0) {
                        System.out.printf("Value regressing: %d%n", valueInput);

                        valueInput--;
                    }

                    break;

                case 2:
                    System.out.println("\n--- Exercício 15: A Tabuada ---");
                    // TODO: Peça um número inteiro qualquer.
                    // TODO: Usando 'for', exiba a tabuada dele de 1 a 10.
                    break;

                case 3:
                    System.out.println("\n--- Exercício 16: Somador de Notas ---");
                    // TODO: Use 'do-while' para pedir números até que o usuário digite 0.
                    // TODO: Exiba a soma total no final.
                    break;

                case 0:
                    System.out.println("Saindo do menu de loops. Até mais!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (option != 0);

        reader.close();
    }
}