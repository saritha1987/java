import java.lang.*;
import java.util.Scanner;

class table
{
    public static void main(String args[])
    {
        int i;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the value of m:");
        int m = in.nextInt();
        System.out.println("enter the value of n:");
        int n = in.nextInt();
        for(i=1;i<=n;i++)
        {
            System.out.println(m+"*"+i+"="+(m*i));
        }

    }
}