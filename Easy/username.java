import java.util.Scanner;
public class username{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the username:");
        String username = sc.nextLine();
        if(isValidUsername(username)) {
            System.out.println("valid username");
        }
            else{
                System.out.println("invalid username");


            }
        }
        public static boolean isValidUsername(String username) {
        if (username.length() < 5 || username.length() > 15) {
            return false;

        }
        for (int i = 0; i < username.length(); i++) {
            char ch = username.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }
        }
        return true;
    }
    }

