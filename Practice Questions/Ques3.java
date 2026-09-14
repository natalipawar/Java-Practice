import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number");
        int b = sc.nextInt();
        System.out.println("Enter 3rd number");
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println(a + " is greater");
        }
        else if (b > c) {
            System.out.println(b + " is greater");
        }
        else {
            System.out.println(c + " is greater");
        }

        if (a < b && a < c) {
            System.out.println(a + " is smallest");
        }
        else if (b < c) {
            System.out.println(b + " is smallest");
        }
        else {
            System.out.println(c+" is smallest");
        }

        sc.close();
    }
}
