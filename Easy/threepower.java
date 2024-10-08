import java.lang.*;
import java.util.Scanner;

class threepower
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter the number:");
        n=in.nextInt();
        if(n<=0)
        {
            System.out.println("Output:"+false);
        }
        while(n%3==0)
        {
            n/=3;
        }
        if(n==1)
        {
            System.out.println("Output:"+true);
        }
        else
        {
            System.out.println("Output:"+false);
        }

    }
}