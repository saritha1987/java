import java.util.Scanner;

class rectpyd

{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n,i,j;
        System.out.print("Enter the no of rows:");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(i==1||i==n||j==1||j==n)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}