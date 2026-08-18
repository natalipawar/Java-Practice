import java.util.Scanner;

public class Parameters {
    public static void printHello() {
        System.out.println("Hello World");
        System.out.println("This is Natali");
    }

    public static int calculateSum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculateSum(a, b); //this sum variable is different from the above one as both are in different classes
        System.out.println("Sum is: " + sum);

        printHello();

        sc.close();
    }
}
