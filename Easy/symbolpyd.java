import java.util.Scanner;

class symbolpyd
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n,i,j;
        System.out.print("Enter the no of rows:");
        n=in.nextInt();
        System.out.print("Enter the character to be printed:");
        String s=in.next();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(s.charAt(0));
            }
            System.out.println();
        }


    }
}