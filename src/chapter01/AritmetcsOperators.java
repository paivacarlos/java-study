package chapter01;

import java.util.Scanner;

public class AritmetcsOperators {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Which exercise do you want to test (1 to 10)?");
        int optionChoosen = reader.nextInt();

        switch (optionChoosen){

            case 1:
                System.out.println("--- executanding exercise 01 ---");
                //Exercise 1: Ask the user for two integers and display their sum.
                System.out.print("Digit first integer number: ");
                int firstNumberInput = reader.nextInt();

                System.out.println();
                System.out.print("Digit second integer number: ");
                int secondNumberInput = reader.nextInt();

                int resultOfTheSum = firstNumberInput + secondNumberInput;
                System.out.println("Result: " + resultOfTheSum);

                break;

            case 2:
                System.out.println("--- executanding exercise 02 ---");
                //Exercise 2: Ask for a temperature in degrees Celsius and convert it to Fahrenheit using the formula: $F = C \times 1.8 + 32$.

                System.out.println("What is the temperature?");
                double temperatureInput = reader.nextDouble();

                double fahrenheitConverter = (temperatureInput * 1.8) + 32;

                System.out.println();
                System.out.printf("Fahrenheit conversion: %.1f", fahrenheitConverter);

                break;

            case 3:
                System.out.println("--- executanding exercise 03 ---");
                //Exercise 3: Create a program that asks for a student's grades on three exams and displays their arithmetic mean.

                System.out.println("Digit the first grade: ");
                double firstGradeInput = reader.nextDouble();

                System.out.println("Digit the second grade: ");
                double secondGradeInput = reader.nextDouble();

                System.out.println("Digit the third grade: ");
                double thirdGradeInput = reader.nextDouble();

                double averageGrade = (firstGradeInput + secondGradeInput + thirdGradeInput) / 3;

                System.out.println();
                System.out.printf("Average of the grades: %.1f", averageGrade);

                break;

            case 4:
                System.out.println("--- executanding exercise 04 ---");
                //Exercise 4: Ask for an integer and display the remainder of its division by 2 (using the % operator).
                //(This allows you to determine whether the number is even or odd!)

                System.out.println("Digit the integer number: ");
                int integerNumber = reader.nextInt();

                if (integerNumber % 2 == 0 ) {
                    System.out.printf("The number %d is even!", integerNumber);
                } else {
                    System.out.printf("The number %d is odd!", integerNumber);
                }

                break;

            case 5:
                System.out.println("--- executanding exercise 05 ---");
                //Ask for an employee's current salary and apply a 10% increase using the *= operator, then display the new salary.

                System.out.println("Please, digit your salary: ");
                double salaryValue = reader.nextDouble();

                salaryValue *= 1.10;

                System.out.printf("Incremented salary: %.2f", salaryValue);
                break;

            case 6:
                System.out.println("--- executanding exercise 06 ---");
                //Exercise 6: Create an int variable x = 10;. Use the decrement operator (--) on it and then display the value in the terminal.

                int intVariable = 10;
                System.out.println("Value original " + intVariable);
                System.out.println(" ");

                intVariable--;
                System.out.println("Value after the decrement operator: " + intVariable);

                break;

            case 7:
                System.out.println("--- executanding exercise 07 ---");
                //Exercise 7: Ask for the user's age and display `true` if they are 18 or older,
                // and `false` otherwise (without using `if`; simply output the result of the comparison `age >= 18` using `System.out.println`).

                System.out.println("Digit the age: ");
                int ageInput = reader.nextInt();

                System.out.println(" ");
                System.out.println(ageInput >= 18);

                break;

            case 8:
                System.out.println("--- executanding exercise 08 ---");
                //Exercise 8: Ask the user to enter a number. The program should display `true` if the number is greater than 10 AND less than 50.
                System.out.println("Digit the value: ");
                double valueInput = reader.nextDouble();

                System.out.println(" ");

                System.out.println(valueInput >= 10 && valueInput <= 50);

                break;

            case 9:
                System.out.println("--- executanding exercise 09 ---");
                //Exercise 9: Create an entry validation system for a party.
                // Ask for the user's age and whether they have parental authorization (by entering `true` or `false`).
                // The program should display `true` if they are of legal age OR have authorization.

                System.out.println("Digit the age: ");
                int ageExer09Input = reader.nextInt();

                System.out.println("Authorization parents: ");
                boolean authorizationInput = reader.nextBoolean();

                System.out.println(" ");
                System.out.println(ageExer09Input >= 18 || authorizationInput);

                break;

            case 10:
                System.out.println("--- executanding exercise 10 ---");
                //Exercise 10: Ask for two numbers and display `true` if they are different (`!=`) from each other.

                System.out.println("Digit first integer value: ");
                int firstIntValueInput = reader.nextInt();

                System.out.println("Digit second integer value: ");
                int secondIntValueInput = reader.nextInt();

                System.out.println(" ");
                System.out.println(firstIntValueInput != secondIntValueInput);

                break;

            case 11:
                System.out.println("--- executanding exercise 11 ---");
                // Exercise 11: O Classificador de Média (Encadeamento)
                // - O que fazer: Peça a nota de duas provas de um aluno (use double) e calcule a média[cite: 223].
                // - A Regra:
                //   * Se a média for maior ou igual a 7.0, exiba "Aprovado"[cite: 224].
                //   * Se a média for entre 5.0 (inclusive) e 6.9, exiba "Recuperação"[cite: 225].
                //   * Se for menor que 5.0, exiba "Reprovado"[cite: 226].
                // - Foco do treino: Praticar a estrutura do else if[cite: 226].

                System.out.println("Digit first grade: ");
                double firstGradeExer11Input = reader.nextDouble();

                System.out.println("Digit second grade: ");
                double secondGradeExer11Inout = reader.nextDouble();
                
                double averageGradeExer11 = (firstGradeExer11Input + secondGradeExer11Inout) / 2;
                
                if (averageGradeExer11 >= 7.0) {
                    System.out.printf("Approved: %.1f", averageGradeExer11);
                } else if (averageGradeExer11 >= 5.0) {
                    System.out.printf("Recovery: %.1f", averageGradeExer11);
                } else{
                    System.out.printf("Failed: %.1f", averageGradeExer11);
                }

                break;

            case 12:
                System.out.println("--- executanding exercise 12 ---");
                // Exercise 12: O Validador de Triângulos (Lógica Combinada)
                // - O que fazer: Peça para o usuário digitar três números inteiros que representam os lados de um triângulo (Lado A, Lado B e Lado C)[cite: 227].
                // - A Regra: Para formar um triângulo válido, a soma de dois lados deve ser sempre maior que o terceiro lado[cite: 228].
                //   Ou seja, o programa só exibe true se: (A + B > C) E (A + C > B) E (B + C > A)[cite: 229].
                // - Desafio: Tente fazer isso exibindo apenas true ou false direto no println, sem usar if/else, combinando os operadores > e &&[cite: 230].

                System.out.println("Digit first integer to create a triangle: ");
                int firstIntegerTriangleInput = reader.nextInt();

                System.out.println("Digit second integer to create a triangle: ");
                int secondIntegerTriangleInput = reader.nextInt();

                System.out.println("Digit third integer to create a triangle: ");
                int thirdIntegerTriangleInput = reader.nextInt();

                System.out.println(" ");
                System.out.println((firstIntegerTriangleInput + secondIntegerTriangleInput > thirdIntegerTriangleInput) &&
                                    (firstIntegerTriangleInput + thirdIntegerTriangleInput > secondIntegerTriangleInput) &&
                                    (secondIntegerTriangleInput + thirdIntegerTriangleInput > firstIntegerTriangleInput));

                break;

            case 13:
                System.out.println("--- executanding exercise 13 ---");
                // Exercise 13: O Simulador de Caixa Eletrônico (Escopo de Decisão)
                // - O que fazer: Crie uma variável double saldo = 500.00;. Peça para o usuário digitar o valor que ele deseja sacar (use reader.nextDouble())[cite: 231, 232].
                // - A Regra:
                //   * Se o valor do saque for menor ou igual ao saldo, subtraia o valor do saldo e exiba: "Saque realizado! Saldo atual: R$ [novo saldo]" (use printf com %.2f)[cite: 233].
                //   * Se o valor do saque for maior que o saldo disponível, exiba: "Saldo insuficiente!"[cite: 234].

                double balance = 500.00;

                System.out.println("Digit value to withdraw: ");
                double valueWithdrawInput = reader.nextDouble();

                if (valueWithdrawInput <= balance) {
                    balance = balance - valueWithdrawInput;
                    System.out.printf("Withdrawal successfully completed! Current balance: %.2f%n", balance);
                } else {
                    System.out.println("Insufficient funds!");
                }

                break;

            default:
                System.out.println("Invalid Option!");
        }

    }

}
