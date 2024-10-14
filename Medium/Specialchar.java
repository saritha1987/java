import java.util.Scanner;
class Specialchar{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the String:");
        String str=in.nextLine();
        int count=0;
        String spl="";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch))
            {
                count++;
                spl+=ch;
            }
        }
        System.out.println("Special characters:"+spl);
        System.out.println("Count:"+count);
    }
}