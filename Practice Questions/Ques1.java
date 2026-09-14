import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        float num1 = sc.nextFloat();

        System.out.println("Enter 2nd number: ");
        float num2 = sc.nextFloat();

        System.out.println("Sum = " + (num1 + num2));
        System.out.println("Difference = " + (num1 - num2));
        System.out.println("Product = " + (num1 * num2));
        System.out.println("Division = " + (num1 / num2));
        System.out.println("Remainder = " + (num1 % num2));

        sc.close();
    }
}
