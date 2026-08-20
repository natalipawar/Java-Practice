public class Multiply {
    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }
    public static void main(String[] args) {
        int a = 20, b = 2;

        int prod = multiply(a, b);
        System.out.println("prod is " + prod);

        int product = multiply(5, 10);
        System.out.println("Product is "+product);
    }
}
