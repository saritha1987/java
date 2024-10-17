public class calculator {
    public static String divide(int numerator, int denominator) {
        try {
            int result = numerator / denominator;
            return "Result: " + result;
        } catch (ArithmeticException e) {
            return "Error: Division by zero is not allowed.";
        }
    }

    public static void main(String[] args) {
        System.out.println(divide(10, 2));
        System.out.println(divide(10, 0));
        System.out.println(divide(0, 0));
    }
}
