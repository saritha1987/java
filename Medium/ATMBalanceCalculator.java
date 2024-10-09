import java.util.Scanner;
public class ATMBalanceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int denomination, numberOfNotes, totalBalance = 0;
        for (int i = 1; i <= 4; i++) {
            System.out.print("Enter the " + i + "st Denomination: ");
            denomination = scanner.nextInt();
            System.out.print("Enter the " + i + "st Denomination number of notes: ");
            numberOfNotes = scanner.nextInt();
            totalBalance += denomination * numberOfNotes;
        }
        System.out.println("Total Available Balance in ATM: " + totalBalance);
        scanner.close();
    }
}