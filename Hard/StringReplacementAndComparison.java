import java.util.Scanner;
public class StringReplacementAndComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the original string: ");
        String originalString = scanner.nextLine();
        System.out.print("Enter the substring to replace: ");
        String substringToReplace = scanner.nextLine();
        System.out.print("Enter the new substring: ");
        String newSubstring = scanner.nextLine();
        String modifiedString = originalString.replace(substringToReplace, newSubstring);
        System.out.println("Modified string: " + modifiedString);
        if (originalString.equals(modifiedString)) {
            System.out.println("The original string and the modified string are the same.");
        } else {
            System.out.println("The original string and the modified string are different.");
        }
        scanner.close();
    }
}