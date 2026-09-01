public class MethodScope {
    public static int printS() {
        int s = 45;
        return s;
    }

    public static void main(String[] args) {
        // System.out.println(s);
        // s can be used as variable because its not in main() scope

        int num = printS();
        System.out.println(num);
    }
}
