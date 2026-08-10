import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int tax;
        System.out.print("Enter your income: ");
        int income = obj.nextInt();

        if (income < 500000) {
            tax = 0;
        }
        else if (income >= 500000 && income < 1000000) {
            tax = (int) (income * 0.2);
        }
        else {
            tax = (int) (income * 0.3);
        }

        System.out.println("your tax is: " + tax);

        obj.close();
    }

}
