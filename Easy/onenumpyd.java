import java.util.Scanner;

class onenumpyd
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n,i,j,s;
        System.out.print("Enter the no of rows:");
        n=in.nextInt();
        System.out.print("Enter the number to be printed:");
        s=in.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(s);
            }
            System.out.println();
        }
        for(i=n-1;i>0;i--)
        {
            for(j=i;j>0;j--)
            {
                System.out.print(s);
            }
            System.out.println();
        }

    }
}
