import java.io.*;
import java.util.Scanner;
class Upperlowercount
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int upp=0,low=0,num=0;
        System.out.println("Enter * to exit...");
        while(true)
        {
            System.out.print("enter the input:");
            char ele=in.next().charAt(0);
            if(ele=='*')
            {
                if(num!=0)
                {
                    num--;
                }
                break;
            }
            else
            {
                if(ele>='A' && ele<='Z')
                {
                    upp++;
                }
                else if(ele>='a' && ele<='z')
                {
                    low++;
                }
                else if(ele>='0' && ele<='9')
                {
                    num++;
                }
            }
        }
        System.out.println("Total no of Upper case letter is:"+upp);
        System.out.println("Total no of Lower case letter is:"+low);
        System.out.println("Total no of numbers is:"+low);
    }
}