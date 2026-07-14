import java.util.ArrayList;
import java.util.Scanner;

public class ExerciseArrays {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n--- ARRAYS AND COLLECTIONS MENU ---");
            System.out.println("1 - Average of Grades (Fixed Array)");
            System.out.println("2 - Dynamic Numbers Search");
            System.out.println("3 - Name List (ArrayList)");
            System.out.println("0 - Exit");
            System.out.print("Choose an option: ");
            option = reader.nextInt();

            switch (option) {
                case 1:
                    System.out.println("\n--- Exercise 01: Average of Grades ---");
                    // TODO [PT-BR]: Peça para o usuário digitar exatamente 4 notas de um aluno.
                    // TODO [PT-BR]: Guarde essas notas em um Array tradicional de tamanho fixo (4 posições).
                    // TODO [PT-BR]: Use um laço (for ou foreach) para somar as notas e calcular a média aritmética final.
                    // TODO [PT-BR]: Exiba a média com duas casas decimais utilizando printf.

                    double[] grades = new double[4];

                    for (int i = 0; i < grades.length; i++) {

                        System.out.printf("Digit the grade: %d%n", i + 1);
                        grades[i] = reader.nextDouble();
                    }

                    double finalAverage = 0;

                    for (double grade: grades) {
                        finalAverage += grade;
                    }

                    System.out.printf("Final Average: %.2f%n", (finalAverage / grades.length));

                    break;

                case 2:
                    System.out.println("\n--- Exercise 02: Dynamic Numbers Search ---");
                    // TODO [PT-BR]: Pergunte ao usuário quantos números inteiros ele deseja registrar.
                    // TODO [PT-BR]: Crie um Array tradicional definindo o tamanho com base no valor digitado (Tempo de Execução).
                    // TODO [PT-BR]: Use um laço para preencher o Array com os inputs do usuário.
                    // TODO [PT-BR]: Depois, peça para ele digitar um último número para "busca".
                    // TODO [PT-BR]: Varra o array e diga se esse número de busca está ou não presente dentro do Array.

                    System.out.println("Hou many integer numbers dou you need to digit: ");
                    int valueLargeIntegerNumberInput = reader.nextInt();

                    int[] valueOfIntegerDigited = new int[valueLargeIntegerNumberInput];

                    for (int i = 0; i < valueOfIntegerDigited.length; i++) {
                        System.out.printf("Value integer to digit position %d%n", i);
                        int valueDigited = reader.nextInt();

                        valueOfIntegerDigited[i] = valueDigited;
                    }

                    System.out.println("Digit a integer number to search: ");
                    int searchValue = reader.nextInt();

                    boolean found = false;

                    for (int i = 0; i < valueOfIntegerDigited.length; i++) {
                        if ( valueOfIntegerDigited[i] == searchValue) {
                            System.out.printf("Value digited exist: %d%n", searchValue);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.printf("Value %d is not fond in the array. %n", searchValue);
                    }

                    break;

                case 3:
                    System.out.println("\n--- Exercise 03: Name List ---");
                    // TODO [PT-BR]: Crie um ArrayList de Strings para armazenar nomes.
                    // TODO [PT-BR]: Use um laço do-while para ficar pedindo nomes ao usuário e adicionando na lista (.add()).
                    // TODO [PT-BR]: O laço deve parar imediatamente quando o usuário digitar a palavra "STOP".
                    // TODO [PT-BR]: No final, use um laço foreach para exibir todos os nomes cadastrados, um por linha.

                    reader.nextLine();

                    ArrayList<String> namesArray = new ArrayList<>();
                    boolean control = true;


                    do {
                        System.out.println("Digit the name: ");
                        String nameInput = reader.nextLine();

                        if(nameInput.equalsIgnoreCase("STOP")) {
                            control = false;
                        } else {
                            namesArray.add(nameInput);
                        }

                    } while(control);

                    for (String name: namesArray) {
                        System.out.printf("Name digited: %s%n", name);
                    }

                    break;

                case 0:
                    System.out.println("Exiting the Arrays menu. See you later!");
                    break;

                default:
                    System.out.println("Invalid option! Please try again.");
            }
        } while (option != 0);

        reader.close();
    }
}