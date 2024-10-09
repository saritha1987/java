import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an option:");
        System.out.println("1: Check if a given string is a palindrome");
        System.out.println("2: Check if a given number is a palindrome");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                System.out.print("Enter a string: ");
                String str = scanner.nextLine();

                if (isPalindromeString(str)) {
                    System.out.println("Palindrome");
                } else {
                    System.out.println("Not a Palindrome");
                }
                break;
            case 2:
                System.out.print("Enter a number: ");
                int num = scanner.nextInt();
                if (isPalindromeNumber(num)) {
                    System.out.println("Palindrome");
                } else {
                    System.out.println("Not a Palindrome");
                }
                break;
            default:
                System.out.println("Invalid choice! Please choose 1 or 2.");
        }
        scanner.close();
    }
    public static boolean isPalindromeString(String str) {
        str = str.toLowerCase().replaceAll("\\s", "");
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindromeNumber(int num) {
        int original = num;
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return original == reversed;
    }
}