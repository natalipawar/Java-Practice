import java.util.*;

public class AvgThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        float num1 = sc.nextFloat();
        System.out.println("Enter 2nd number: ");
        float num2 = sc.nextFloat();
        System.out.println("Enter 3rd number: ");
        float num3 = sc.nextFloat();

        float avg = (num1 + num2 + num3) / 3;
        System.out.println("Average of three numbers is " + avg);

        sc.close();

    }
}