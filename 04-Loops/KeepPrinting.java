import java.util.Scanner;

public class KeepPrinting {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        do {
            System.out.print("Enter a number: ");
            int n = obj.nextInt();

            if (n % 10 == 0) {
                break;
            }
            System.out.println(n);
        } while (true);

        obj.close();
    }
}
