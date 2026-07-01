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

            default:
                System.out.println("Invalid Option!");
        }

    }

}
