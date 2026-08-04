import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        float a = obj.nextFloat();

        System.out.println("Enter 2nd number: ");
        float b = obj.nextFloat();

        float prod = a * b;
        System.out.println("Product of two numbers is: " + prod);

        obj.close();
    }
}
