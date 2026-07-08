import java.util.Scanner;

public class ExerciseLoops {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n--- Menu of loops ---");
            System.out.println("1 - Regressing counter (while)");
            System.out.println("2 - Multiplication table (for)");
            System.out.println("3 - Sum grades (do-while)");
            System.out.println("0  - out");
            System.out.print("Choose the exercise: ");
            option = reader.nextInt();

            switch (option) {
                case 1:
                    System.out.println("\n--- Exercise 01: Regressing counter ---");
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
                    System.out.println("\n--- Exercíse 02: Multiplication table ---");
                    // TODO: Peça um número inteiro qualquer.
                    // TODO: Usando 'for', exiba a tabuada dele de 1 a 10.

                    System.out.println("Digit integer value to multiplication table: ");
                    int valueInputMultiplicationTable = reader.nextInt();

                    for (int i = 1; i <= 10; i++) {

                        System.out.printf("%d x %d = %d%n", i, valueInputMultiplicationTable, (valueInputMultiplicationTable * i));
                    }

                    break;

                case 3:
                    System.out.println("\n--- Exercise 03: Sum grades ---");
                    // TODO: Use 'do-while' para pedir números até que o usuário digite 0.
                    // TODO: Exiba a soma total no final.
                    break;

                case 0:
                    System.out.println("Get out of loops menu. See you later!!");
                    break;

                default:
                    System.out.println("Invalid Option. Try Again!");
            }
        } while (option != 0);

        reader.close();
    }
}