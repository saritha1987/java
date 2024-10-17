import java.util.Scanner;

public class NumericDataProcessor {
    public static double parseNumericData(String input) throws NumberFormatException {
        double number = Double.parseDouble(input);
        return number;
    }
    public static double processData(double number) throws IllegalArgumentException {
        if (number < 0) {
            throw new IllegalArgumentException("Error: Cannot process negative numbers for this calculation.");
        }
        return Math.sqrt(number);
    }
    public static void handleNumericDataProcessing() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number for processing: ");

        String input = scanner.nextLine();
        try {
            double number = parseNumericData(input);
            double result = processData(number);
            System.out.println("Processing result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format. Please enter a valid numeric value.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: An unexpected error occurred: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        handleNumericDataProcessing();
    }
}

