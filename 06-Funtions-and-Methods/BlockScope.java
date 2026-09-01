public class BlockScope {

    public static void main(String[] args) {
        int p = 10;
        {
            // int s = 45;
            // this s can be used only within this block
            System.out.println(p);
        }
        // System.out.println(s); // error
        System.out.println(p);
    }
}
