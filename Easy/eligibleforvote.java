import java.lang.*;
import java.util.Scanner;

class eligiblevote
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the age:");
        int age =in.nextInt();
        if(age>=18)
        {
            System.out.println("you are eligible for vote");
        }
        else
        {
            System.out.println("you are eligible to vote after "+(18-age)+" years");
        }
    }
}