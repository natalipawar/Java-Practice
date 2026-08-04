import java.util.Scanner;

public class Us {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        float a = obj.nextFloat();

        System.out.println("Enter 2nd number: ");
        float b = obj.nextFloat();

        float sum = a+b;
        System.out.println("Sum of two numbers is: " +sum);

        obj.close();
    }
}
