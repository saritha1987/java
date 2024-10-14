import java.lang.*;
import java.util.Scanner;

class perfect
{
    public static void main(String args[])
    {
        int i,sum=0;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = in.nextInt();
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
        if(n==sum)
        {
            System.out.print(n+" is a perfect number");
        }
        else
        {
            System.out.print(n+" is a not perfect number");
        }

    }
}