public class PassByReference {

    public static void update(int marks[], int notChange) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
        notChange = 10;
    }
    public static void main(String[] args) {
        int marks[] = { 97, 98, 96 };
        int notChange = 5;
        update(marks, notChange);

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i] + " "); // pass by reference
        }
        System.out.println();

        System.out.println(notChange); // pass by value
    }
}
