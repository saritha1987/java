import java.util.Scanner;

public class decimalconverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        int decimal = scanner.nextInt();

        System.out.println("Binary Number = " + Integer.toBinaryString(decimal));
        System.out.println("Octal Number = " + Integer.toOctalString(decimal));

        scanner.close();
    }
}