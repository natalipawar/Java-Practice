import java.util.*;

public class LeapYear {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = obj.nextInt();

        if (year % 4 == 0) {
            if (year % 10 != 0) {
                System.out.println("Leap Year!");
            } else {
                if (year % 400 == 0) {
                    System.out.println("Leap Year!");
                } else {
                    System.out.println("Not a Leap Year.");
                }
            }
        }
        obj.close();
    }

}
