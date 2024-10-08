import java.lang.*;
import java.util.Scanner;
class Fibo
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int a=0,b=1,c,count=2;
        System.out.print("enter the number:");
        int n =in.nextInt();
        System.out.print("fibonacci series:");
        System.out.print(a+" ");
        System.out.print(b+" ");
        while(count<n)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
            count++;
        }
    }
}
