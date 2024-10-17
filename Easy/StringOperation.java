import java.util.Scanner;
public class StringOperation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        int length = inputString.length();
        System.out.println("Length of the string: " + length);
        String uppercaseString = inputString.toUpperCase();
        System.out.println("String in uppercase: " + uppercaseString);
        scanner.close();
    }
}

