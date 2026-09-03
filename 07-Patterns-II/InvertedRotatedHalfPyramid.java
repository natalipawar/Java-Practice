public class InvertedRotatedHalfPyramid {

    public static void pattern(int totRows) {

        //outer loop for rows
        for (int i = 1; i <= totRows; i++) {

            //print spaces
            for (int j = 1; j <= totRows - i; j++) {
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
        pattern(7);
    }
}
