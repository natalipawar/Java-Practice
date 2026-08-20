public class CallByValue {

    public static void swap(int a, int b) {

        //swap - values exchange
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Value of a after swap: " + a);
        System.out.println("Value of b after swap: " + b);
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Value of a before swap: " + a);
        System.out.println("Value of b before swap: " + b);

        swap(a, b);

        //values of a and b in main function will remain same even after swapping
        System.out.println("Value of a after swap (in main function): " + a);
        System.out.println("Value of b after swap (in main function): " + b);
    }
}
