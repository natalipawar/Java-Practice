import java.util.Scanner;

public class KeepPrintingExcept {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter your number: ");
            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            if (n % 10 == 0) {
                continue;
            }
            System.out.println(n);

        } while (true);
        sc.close();

    }
}
// sc.close() will be unreachable if there won't be any stopping condition in the loops.

