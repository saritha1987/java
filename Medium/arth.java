import java.util.*;
class Arth
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a,b;
        System.out.print("Enter the value of a:");
        a=in.nextInt();
        System.out.print("Enter the value of b:");
        b=in.nextInt();
        System.out.println("Enter the choice:\n 1 for addition \n 2 for subtraction \n 3 for multiplication \n 4 for divison \n 5 for modulo");
        int choice=in.nextInt();
        switch(choice){
            case 1:
                System.out.println("Addition:"+(a+b));
                break;
            case 2:
                System.out.println("Subtraction:"+(a-b));
                break;
            case 3:
                System.out.println("Multiplication:"+(a*b));
                break;
            case 4:
                System.out.println("Division:"+(a/b));
                break;
            case 5:
                System.out.println("Modulo:"+(a%b));
                break;
            default:
                System.out.println("Please enter the valid choice");
        }


    }
}