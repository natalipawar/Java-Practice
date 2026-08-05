public class TypePromotion {
    public static void main(String[] args) {

        // char a = 'a';
        // char b = 'b';
        // System.out.println((int) a);
        // System.out.println((int) b);
        // System.out.println(b - a);

        // System.out.println(a);

        // As a and b are int now
        // char c = b - a;
        // System.out.println(c);

        // short a = 5;
        // byte b = 10;
        // char c = 'c';

        // // int sum = a + b + c;
        // // System.out.println(sum);

        // error
        // byte ans = a + b + c;
        // byte ans = (byte) (a + b + c);
        // System.out.println(ans);

        // int a = 5;
        // float b = 6.2f;
        // long c = 10;
        // double d = 20.5;

        // double ans = a + b + c + d;
        // System.out.println(ans);

        byte b = 3;
        // b = b*3;
        byte a = (byte) (b * 2);
        System.out.println(a);

    }
}
