import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(int n) {
        int num = n;
        int rev = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            rev = (rev * 10) + lastDigit;
            num = num / 10;
        }
        if (n==rev) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if (isPalindrome(n)) {
            System.out.println("Number is palindrome.");
        }
        else {
            System.out.println("Number is not palindrome.");
        }

        sc.close();
    }
}
