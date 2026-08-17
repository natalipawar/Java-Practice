import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a number for the table: ");
        int n = obj.nextInt();

        /* Using for loop

        for (int i = 1; i <= 10; i++) {
            System.out.println(n+" x "+i+" = "+(n*i));
        } */

        /* Using while loop

        int i = 1;
        while (i <= 10) {
            System.out.println(n + " x " + i + " = " + (n * i));
            i++;
        } */

        /* Using do while loop
        int i = 1;
        do{
            for(i=1;i<=10;i++){
                System.out.println(n + " x " + i + " = " + (n * i));
            }
        } while (i<=10);
        */
    }
}
