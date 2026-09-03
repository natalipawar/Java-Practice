import java.util.Scanner;
public class SumOfDigits {
    public static int sumOfDigits(int n) {

        int sum = 0;

        while (n > 0) {
            int remainder = n % 10;

            sum = sum + remainder;
            n = n / 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int sum = sumOfDigits(n);
        System.out.println("Sum of digits of  "+n+" is "+sum);
        sc.close();
    }
}
