import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
class Sortstr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the List Size: ");
        int n = in.nextInt();
        in.nextLine();
        List<String> names = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the String: ");
            String str = in.nextLine();
            names.add(str);
        }
        System.out.print("Order (A/D): ");
        String order = in.next().trim().toUpperCase();
        if (order.equals("A")) {
            Collections.sort(names);
            System.out.println("Sorted list (Ascending): " + names);
        } else if (order.equals("D")) {
            Collections.sort(names, Collections.reverseOrder());
            System.out.println("Sorted list (Descending): " + names);
        } else {
            System.out.println("Invalid choice! Please enter 'A' for ascending or 'D' for descending.");
        }
        in.close();
    }
}