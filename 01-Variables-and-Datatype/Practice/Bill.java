import java.util.*;

public class Bill {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Cost of pencil: ");
        float item1 = obj.nextFloat();

        System.out.print("Cost of pen: ");
        float item2 = obj.nextFloat();

        System.out.print("Cost of eraser: ");
        float item3 = obj.nextFloat();

        float totalCost = item1 + item2 + item3; // Original amout
        float gstRate = 0.18f; // 18% GST
        float totalBill = totalCost + (gstRate * totalCost);

        System.out.println("Total bill amount: " + totalBill);
        obj.close();

    }

}
