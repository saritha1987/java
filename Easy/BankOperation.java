import java.util.Scanner;
class Customer {
    private int accountNo;
    private String accName;
    private int balance;
    public Customer(int accountNo, String accName, int balance) {
        this.accountNo = accountNo;
        this.accName = accName;
        this.balance = balance;
    }
    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
        notify();
    }
    public synchronized void withdraw(int amount) {
        System.out.println("Attempting to withdraw: " + amount);
        while (balance < amount) {
            System.out.println("Insufficient balance. Waiting for deposit...");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        balance -= amount;
        System.out.println("Withdraw operation success, Balance amount: " + balance);
    }
    public int getBalance() {
        return balance;
    }
}
public class BankOperation {
    public static void main(String[] args) {
        Customer customer = new Customer(12345, "John Doe", 10000);
        Scanner scanner = new Scanner(System.in);
        Thread withdrawThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.print("Enter the amount to withdraw: ");
                int withdrawAmount = scanner.nextInt();
                customer.withdraw(withdrawAmount);
            }
        });
        Thread depositThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.print("Enter the amount to deposit: ");
                int depositAmount = scanner.nextInt();
                customer.deposit(depositAmount);
            }
        });
        withdrawThread.start();
        depositThread.start();
        try {
            withdrawThread.join();
            depositThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
