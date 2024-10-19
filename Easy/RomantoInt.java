import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class RomanToInt
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Roman Letter:");
        String str= in.next();
        try
        {
            System.out.println("Output:"+romanTodInt(str));
        } catch(IllegalArgumentException e){
            System.out.println("Output: Invalid Roman Numeral");}
    }
    public static int romanTodInt(String str){
        Map<Character,Integer> romanMap = new HashMap<>();
        romanMap.put('I',1);
        romanMap.put('V',5);
        romanMap.put('X',10);
        romanMap.put('L',50);
        romanMap.put('C',100);
        romanMap.put('D',500);
        romanMap.put('M',1000);
        int sum=0;
        for(int i=0;i<str.length();i++){
            char current=str.charAt(i);
            if(!romanMap.containsKey(current)){
                throw new IllegalArgumentException("Invalid Roman Numeral");}
            int currentvalue = romanMap.get(current);
            if (i + 1 < str.length() && romanMap.get(str.charAt(i + 1)) > currentvalue) {
                sum -= currentvalue;
            } else {
                sum += currentvalue;
            }
        }
        return sum;
    }
}
