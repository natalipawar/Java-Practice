import java.util.Scanner;

public class PrintSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value: ");
        int number = sc.nextInt();

        int sum = 0, count = 1;

        while (count <= number) {
            sum += count;
            count++;
        }
        System.out.print("Total sum of " + number + " Natural numbers is: " + sum);

        sc.close();
    }
}
