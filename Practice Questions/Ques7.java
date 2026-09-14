import java.util.Scanner;

public class Ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter purchase: ");
        float n = sc.nextFloat();

        float discount = 0;

        if (n < 1000) {
            System.out.println("No discount");
        }
        else if (1000 <= n && n < 5000) {
            discount = n * 0.1f;
        }
        else {
            discount = n * 0.2f;
        }

        float totalBill = n - discount;
        System.out.println("Discount amount: "+discount);
        System.out.println("Total bill: " + totalBill);

        sc.close();
    }
}
