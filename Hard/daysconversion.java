import java.util.Scanner;
public class daysconversion {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of days");
        int days = input.nextInt();
        int years = days/365;
        int remainingDays = days % 365;
        int weeks = remainingDays /7 ;
        remainingDays = remainingDays % 7;
        System.out.println(days + "days are approximately" + years + "years,"+weeks + "weeks,and " + remainingDays + "days.");
        input.close();
    }
}
