import java.lang.*;
import java.util.Scanner;

class sumdigit
{
    public static void main(String args[])
    {
        int i,sum=0;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = in.nextInt();
        int temp = n;
        while(temp!=0)
        {
            i=temp%10;
            sum+=i;
            temp=temp/10;
        }
        System.out.println("sum:"+sum);
    }
}