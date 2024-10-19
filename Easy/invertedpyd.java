import java.util.Scanner;

class invertedpyd
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n,i,j,k;
        System.out.print("Enter the no of rows:");
        n=in.nextInt();
        for(i=n;i>=1;--i)
        {
            for(j=1;j<=n-i;++j)
            {
                System.out.print(" ");
            }
            for(k=i;k>=1;--k)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}