import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter radius of circle: ");
        float radius = obj.nextFloat();
        float area = 3.14f * radius * radius;
        System.out.println("Area of circle is: " + area);

        obj.close();
    }
}
