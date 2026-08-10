import java.util.Scanner;

public class PassFail {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter marks: ");
        int marks = obj.nextInt();

        String result = (marks >= 33) ? "PASS" : "FAIL";
        System.out.println(result);
        obj.close();
    }

}
