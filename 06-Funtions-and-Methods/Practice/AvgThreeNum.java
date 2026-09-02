import java.util.Scanner;

public class AvgThreeNum {

    public static double sum(double x, double y, double z) {
        double sum = x + y + z;
        return sum;
    }

    public static double average(double a, double b, double c) {
        double avg = sum(a,b,c) / 3;
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter 2nd number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter 3rd number: ");
        double num3 = sc.nextDouble();

        double avg = average(num1, num2, num3);

        System.out.println("Average of three numbers: " + avg);

        sc.close();
    }
}
