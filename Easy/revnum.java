import java.util.Scanner;

class Revnum
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n,i,rev=0;
        System.out.print("Enter the number:");
        n=in.nextInt();
        while(n!=0)
        {
            i=n%10;
            rev=rev*10+i;
            n/=10;
        }
        System.out.println("reverse number:"+rev);

    }
}
