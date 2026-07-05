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
                //Exercise 9: Create an entry validation system for a party. Ask for the user's age and whether they have parental authorization (by entering `true` or `false`). The program should display `true` if they are of legal age OR have authorization.

            case 10:
                System.out.println("--- executanding exercise 10 ---");
                //Exercise 10: Ask for two numbers and display `true` if they are different (`!=`) from each other.
                break;

            default:
                System.out.println("Invalid Option!");
        }

    }

}
