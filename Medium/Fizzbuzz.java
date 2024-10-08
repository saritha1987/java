import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
class Fizzbuzz
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        int n;
        System.out .println("Enter a number");
        n = in.nextInt();
        List<String> result = fizzbuzz(n);
        System.out.println(result);
    }
    public static List<String> fizzbuzz(int n)
    {
        List<String> answer = new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            if(i%3==0 &&i%5==0)
            {
                answer.add("fizzbuzz");
            }
            else if(i%3==0)
            {
                answer.add("fizz");
            }
            else if(i%5==0)
            {
                answer.add("buzz");
            }
            else{
                answer.add(Integer.toString(i));
            }
        }
        return answer;
    }
}
