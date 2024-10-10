import java.util.Scanner;

public class tax{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the income: ");
        double income = scanner.nextDouble();

        double taxableIncome = income - 250000;
        double tax = 0;

        if (taxableIncome <= 0) {
            tax = 0;
        } else if (taxableIncome <= 250000) {
            tax = taxableIncome * 0.10;
        } else if (taxableIncome <= 750000) {
            tax = 250000 * 0.10 + (taxableIncome - 250000) * 0.20;
        } else {
            tax = 250000 * 0.10 + 500000 * 0.20 + (taxableIncome - 750000) * 0.30;
        }

        System.out.printf("Taxable Income: %.2f\n", taxableIncome > 0 ? taxableIncome : 0);
        System.out.printf("Tax: %.2f\n", tax);
    }
}