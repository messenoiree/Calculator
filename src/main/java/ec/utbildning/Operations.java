package ec.utbildning;

public class Operations {

    public static double multiply(double factor1, double factor2){
        double product = factor1 * factor2;
        return product;
    }
    public static double sqrt(double radicand) {
        double result = Math.sqrt(radicand);
        return result;
    }

    public static double divide(double numerator, double denominator){
        double result = numerator / denominator;
        return result;
    }
    public static double subtract(double term1, double term2) {
        double difference = term1 - term2;
        return difference;
    }
    public static int addition(int firstNr, int secondNr){
        int result=firstNr+secondNr;
        return result;

    }
}
