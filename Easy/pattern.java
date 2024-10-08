import java.util.Scanner;

class Pattern10
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n,i,j;
        System.out.print("Enter the no of rows:");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        for(i=n-1;i>0;i--)
        {
            for(j=i;j>0;j--)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}