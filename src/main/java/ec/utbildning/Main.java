package ec.utbildning;


import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws InvalidAnswerException {

        System.out.println("Booting up Calculator 3000 ...");
        System.out.println("Finished booting up Calculator 3000");

        boolean isRunning = true;
        while (isRunning) {
            int choice = selectInput();
            switch (choice) {
                case 1:
                    handleAddition();
                    break;
                case 2:
                    handleSubtraction();
                    break;
                case 3:
                    handleMultiplication();
                    break;
                case 4:
                    handleDivision();
                    break;
                case 5:
                    handleSquareRoot();
                    break;
                case 6:
                    isRunning = false;
                    System.out.println("You've selected to quit the calculator. Goodbye!");
                    break;

            }

        }

    }

    // Här nere är ett fel, vet inte ännu hur vi ska lösa det
    public static int selectInput() {
        System.out.println("Type the corresponding number to select your desired operation: ");
        System.out.println("1. Addition");// Matilda tar denna
        System.out.println("2. Subtraction");//Konstantin tar denna!
        System.out.println("3. Multiplication"); // Robin tar denna!
        System.out.println("4. Division"); // Fatima tar denna!
        System.out.println("5. Square root"); // Marcus tar denna!
        System.out.println("6. Exit program");
        System.out.print("Your choice: ");

        int choice = 0;

        try {
            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice > 6) {
                System.out.println("Please choose an option from the menu!");
            }

        } catch (InputMismatchException e) {

            System.out.println("Error, only use numbers!");
            scanner.nextLine();
        }

        return choice;
    }


    public static void handleMultiplication() {

        System.out.println("You've opted for multiplication");
        System.out.println("Enter your first factor: ");
        double factor1 = scanner.nextDouble();
        System.out.println("Enter your second factor: ");
        double factor2 = scanner.nextDouble();
        double product = Operations.multiply(factor1, factor2);
        System.out.println("The result of " + factor1 + " multiplied by " + factor2 + " is " + product);

    }

    public static void handleAddition() {

        System.out.println("You opted for addition");
        System.out.println("Write the first number: ");
        double firstNr = checkInput();
        System.out.println("Write the number you like to add up:");
        double secondNr = checkInput();
        double result = Operations.add(firstNr, secondNr);
        System.out.println("Result of " + firstNr + " + " + secondNr + " is: " + result);
    }

    public static void handleSubtraction() {
        System.out.println("You've opted for subtraction");
        System.out.println("Enter your first term: ");
        double term1 = scanner.nextInt();
        System.out.println("Enter your second term: ");
        double term2 = scanner.nextInt();
        double difference = Operations.subtract(term1, term2);
        System.out.println("The result of " + term1 + " subtracted by " + term2 + " is " + difference);
    }

    public static void handleDivision() {
        System.out.println("You've opted for division");
        System.out.println("Enter your numerator: ");
        double numerator = scanner.nextInt();
        System.out.println("Enter your denominator: ");
        double denominator = scanner.nextInt();
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

    public static double checkInput() {
        boolean isInvalid = true;
        double convertedToDouble = 0;
        String userInput = "";
        while (isInvalid) {
            try {
                userInput = scanner.nextLine();
                convertedToDouble = Double.parseDouble(userInput);
                isInvalid = false;
            } catch (Exception e) {
                System.out.println("Invalid input, you must input a number.");
            }
        }
        return convertedToDouble;
    }


}
