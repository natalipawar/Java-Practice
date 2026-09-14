import java.util.Scanner;

public class Ques6 {
    public static void isPrime(int n) {
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                System.out.println("number is not prime");
                break;
            } else {
                System.out.println("number is prime");
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int a = sc.nextInt();

        isPrime(a);
        sc.close();
    }
}
