public class LargestNumber {

    public static int largestNumber(int numbers[]) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = { 1, 2, 6, 3, 5 };

        int largest = largestNumber(numbers);
        System.out.println("Largest is "+largest);

    }
}
