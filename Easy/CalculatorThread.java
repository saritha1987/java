import java.util.Scanner;
abstract class CalculatorOperation extends Thread {
    protected int num1;
    protected int num2;
    public CalculatorOperation(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
}
class Addition extends CalculatorOperation {
    public Addition(int num1, int num2) {
        super(num1, num2);
    }
    @Override
    public void run() {
        System.out.println("Addition: " + (num1 + num2));
    }
}
class Subtraction extends CalculatorOperation {
    public Subtraction(int num1, int num2) {
        super(num1, num2);
    }
    @Override
    public void run() {
        System.out.println("Subtraction: " + (num1 - num2));
    }
}
class Multiplication extends CalculatorOperation {
    public Multiplication(int num1, int num2) {
        super(num1, num2);
    }

    @Override
    public void run() {
        System.out.println("Multiplication: " + (num1 * num2));
    }
}
class Division extends CalculatorOperation {
    public Division(int num1, int num2) {
        super(num1, num2);
    }
    @Override
    public void run() {
        if (num2 != 0) {
            System.out.println("Division: " + (num1 / num2));
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }
}
public class CalculatorThread {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2, choice;

        System.out.print("Enter the number 1: ");
        num1 = in.nextInt();
        System.out.print("Enter the number 2: ");
        num2 = in.nextInt();

        System.out.print("Enter the choice \n1 for Addition \n2 for Subtraction \n3 for Multiplication \n4 for Division ,Enter: ");
        choice = in.nextInt();

        Thread operationThread = null;

        switch (choice) {
            case 1:
                operationThread = new Addition(num1, num2);
                break;
            case 2:
                operationThread = new Subtraction(num1, num2);
                break;
            case 3:
                operationThread = new Multiplication(num1, num2);
                break;
            case 4:
                operationThread = new Division(num1, num2);
                break;
            default:
                System.out.println("Please enter a valid choice.");
                System.exit(1);
        }

        if (operationThread != null) {
            operationThread.start();
            try {
                operationThread.join();
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}
