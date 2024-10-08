import java.util.Scanner;
import java.lang.Math;
class PerfectSqr
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=in.nextInt();
        if (n < 0) {
            System.out.println("Negative numbers do not have real square roots.");
        } else {
            double sqrt = Math.sqrt(n);
            if (sqrt == Math.floor(sqrt)) {
                System.out.println("Square Root: " + (int)sqrt + ", -" + (int)sqrt);
            } else {
                System.out.println("The number is not a perfect square.");
            }
        }




    }
}
