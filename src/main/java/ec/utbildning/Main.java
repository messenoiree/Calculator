package ec.utbildning;

import java.util.List;
import java.util.Scanner;

import static ec.utbildning.Operations.multiplication;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Booting up Calculator 3000 ...");
        System.out.println("Finished booting up Calculator 3000");

        boolean inuse = true;
        while(inuse){
            int choice = selectInput();
            switch (choice){
                case 3:
                    handleMultiplication();
                case 4:
                    handleDivision();
                case 6:
                    inuse = false;
                    System.out.println("You've selected to quit the calculator. Goodbye!");
                    break;
            }
        }

    }

    // Här nere är ett fel, vet inte ännu hur vi ska lösa det
    public static int selectInput() throws InvalidAnswerException  {
        List<Integer> acceptableAnswers = List.of(1, 2, 4, 5, 6);
        System.out.println("Type the corresponding number to select your desired operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication"); // Robin tar denna!
        System.out.println("4. Division"); // Fatima tar denna!
        System.out.println("5. Square root"); // Marcus tar denna!
        System.out.println("6. Exit program");
        System.out.println("Your choice: ");
        int choice = scanner.nextInt();
        if(!acceptableAnswers.contains(choice)) {
            // Och på grund av ovan fel blir detta också fel
            throw new InvalidAnswerException("Not a valid answer");
        } else {
            return choice;
        }
    }

    public static void handleAddition(){

    }

    public static void handleMultiplication(){

        System.out.println("You've opted for multiplication");
        System.out.println("Enter your first factor: ");
        double factor1 = scanner.nextDouble();
        System.out.println("Enter your second factor: ");
        double factor2 = scanner.nextDouble();
        double product = Operations.multiply(factor1, factor2);
        System.out.println("The result of " + factor1 + " multiplied by " + factor2 + " is " + product);

    }

    public static void handleDivision(){
        System.out.println("You've opted for division");
        System.out.println("Enter your numerator: ");
        int numerator = scanner.nextInt();
        System.out.println("Enter your denominator: ");
        int denominator = scanner.nextInt();
        double quotient = Operations.divide(numerator, denominator);
        System.out.println("The result of " + numerator + " divided by " + denominator + " is " + quotient);
    }

    public static void handleSquareRoot() {
        System.out.println("You've opted in for square root");
        System.out.println("Enter your number: ");
        double radicand = scanner.nextDouble();
        double square = Operations.sqrt(radicand);
        System.out.println("The square root of " + radicand + " is " + square);


    }


}
