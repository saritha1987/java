import java.util.Scanner;

class Fact
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=in.nextInt();
        int f=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                f+=1;
            }
        }
        System.out.println("No of Factors for "+n+" is:"+f);

    }
}