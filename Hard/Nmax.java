import java.util.*;
class Nmax
{
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int arr[]={3,4,7,1,8,5};
        System.out.print("enter the nth number:");
        int n=in.nextInt();
        int i,j,temp;
        int s=arr.length;
        for(i=0 ; i<s ;i++)
        {
            for(j=i+1 ; j<s ;j++)
            {
                if(arr[i]<arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(i=0 ; i<s ; i++)
        {
            System.out.print(arr[i]+",");
        }
        System.out.println("Max:"+arr[n-1]);
    }
}