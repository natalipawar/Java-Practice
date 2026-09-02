import java.util.Scanner;

public class MathClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num1: ");
        double num1 = sc.nextDouble();

        System.out.println("Enter num2: ");
        double num2 = sc.nextDouble();

        System.out.println("Small is " + Math.min(num1, num2));

        System.out.println("Large is " + Math.max(num1, num2));

        double num = Math.sqrt(num2);
        System.out.println("square root is: " + num);

        double pow = Math.pow(num1, num2);
        System.out.println("Power is " + pow);

        int n = -12;
        num = Math.abs(n);
        System.out.println("absolute value is " +num);
    }

}
