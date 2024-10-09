import java.util.Scanner;
class Dectoother
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int i,n,j=1,bin=0;
        System.out.print("Enter the number:");
        n=in.nextInt();
        int temp=n;
        while(n!=0)
        {
            i=n%2;
            bin=bin+(i*j);
            n/=2;
            j*=10;
        }
        System.out.println("binary value:"+bin);
    }
}