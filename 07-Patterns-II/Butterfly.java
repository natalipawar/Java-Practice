public class Butterfly {

    public static void pattern(int n) {

        for (int i = 1; i <= n; i++) {

            //print *
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            //print spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            //print *
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //other half
        for (int i = n; i >= 1; i--) {

            //print *
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            //print spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            //print *
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(5);
    }
}
