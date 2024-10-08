import java.io.*;
import java.util.Scanner;
class Avg
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int pos=0,neg=0,p=0,n=0;
        System.out.println("Enter -1 to exit...");
        while(true)
        {
            System.out.print("enter the no:");
            int ele=in.nextInt();
            if(ele==-1)
            {
                break;
            }
            else
            {
                if(ele>0)
                {
                    pos+=ele;
                    p++;
                }
                else if(ele<0)
                {
                    neg+=ele;
                    n++;
                }
            }
        }
        float pavg = pos/p;
        float navg = neg/n;
        System.out.println("The average of positive numbers is: "+(pavg));
        System.out.println("The average of negative numbers is: "+(navg));
    }
}
