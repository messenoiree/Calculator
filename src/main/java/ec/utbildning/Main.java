package ec.utbildning;


import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

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

        System.out.println("\nYou've opted for multiplication");
        System.out.print("Enter your first factor: ");
        double factor1 = checkInput();
        System.out.print("Enter your second factor: ");
        double factor2 = checkInput();
        double product = Operations.multiply(factor1, factor2);
        System.out.println("The result of " + factor1 + " multiplied by " + factor2 + " is " + product+"\n");

    }

    public static void handleAddition() {

        System.out.println("\nYou opted for addition");
        System.out.print("Write the first number: ");
        double firstNr = checkInput();
        System.out.print("Write the number you like to add up: ");
        double secondNr = checkInput();
        double result = Operations.add(firstNr, secondNr);
        System.out.println("Result of " + firstNr + " + " + secondNr + " is: " + result+"\n");
    }

    public static void handleSubtraction() {
        System.out.println("\nYou've opted for subtraction");
        System.out.print("Enter your first term: ");
        double term1 = checkInput();
        System.out.print("Enter your second term: ");
        double term2 = checkInput();
        double difference = Operations.subtract(term1, term2);
        System.out.println("The result of " + term1 + " subtracted by " + term2 + " is " + difference+"\n");
    }

    public static void handleDivision() {
        System.out.println("\nYou've opted for division");
        System.out.print("Enter your numerator: ");
        double numerator = checkInput();
        System.out.print("Enter your denominator: ");
        double denominator = checkInput();
        while (denominator == 0){
            System.out.println("Denominator must be greater than 0!");
            System.out.print("Enter your denominator: ");
            denominator = checkInput();
        }
        double quotient = Operations.divide(numerator, denominator);
        System.out.println("The result of " + numerator + " divided by " + denominator + " is " + quotient+"\n");
    }

    public static void handleSquareRoot() {
        System.out.println("\nYou've opted in for square root");
        System.out.print("Enter your number: ");
        double radicand = checkInput();
        double square = Operations.sqrt(radicand);
        System.out.println("The square root of " + radicand + " is " + square+"\n");


    }

    public static double checkInput() {
        boolean isInvalid = true;
        double convertedToDouble = 0;
        String userInput;
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
