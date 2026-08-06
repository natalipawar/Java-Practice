import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter side of square: ");
        int side = obj.nextInt();

        int area = side * side;
        System.out.print("Area of square is " + area);
        obj.close();
    }
}
