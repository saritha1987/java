import java.lang.*;
import java.util.Scanner;

class simpleinterest
{
    public static void main(String[] args)
    {
        float p,r,si;
        int t;
        char sen;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the principle amount:");
        p=in.nextFloat();
        System.out.println("enter the year:");
        t=in.nextInt();
        System.out.println("Is customer senior citizen (y/n):");
        sen=in.next().charAt(0);
        if(sen=='y'||sen=='Y')
        {
            r=12;
            si=(p*r*t)/100;
        }
        else
        {
            r=10;
            si=(p*r*t)/100;
        }
        System.out.println("simple interest:"+si);
    }
}
