import java.util.Scanner;
class Compcount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, n,j,comp=0;
        System.out.print("Enter the array size:");
        n = in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements:");
        for (i = 0; i < n; i++) {
            System.out.print("Enter element:");
            arr[i] = in.nextInt();
        }
        for (i = 0; i <n; i++) {
            int count=1;
            for(j=2;j<=arr[i];j++)
            {
                if(arr[i]%j==0)
                {
                    count++;
                }
            }
            if(count>2)
            {
                comp++;
            }
        }
        System.out.println("Number of Composite Numbers = "+comp);
    }
}
