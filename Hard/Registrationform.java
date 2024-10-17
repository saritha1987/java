import java.util.InputMismatchException;
import java.util.Scanner;

public class Registrationform {
    public static int getUserAge() {
        Scanner scanner = new Scanner(System.in);
        int age = -1;
        while (true) {
            try {
                System.out.print("Enter your age: ");
                age = scanner.nextInt();

                if (age < 0) {
                    throw new IllegalArgumentException("Error: Age cannot be negative.");
                }

                return age;
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter a valid numeric value for age.");
                scanner.next();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public static void main(String[] args) {
        int age = getUserAge();
        System.out.println("Registration successful. Your age is: " + age);
    }
}

