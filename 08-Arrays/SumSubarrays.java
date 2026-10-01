//fix the output

public class SumSubarrays {
    public static void sumSubarray(int numbers[]) {
        int totalSubarray = 0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;

            for (int j = i; j < numbers.length; j++) {
                int end = j;
                int sum = 0;

                for (int k = start; k <= end; k++) { //print
                    System.out.print(numbers[k] + " "); //subarray
                    sum += numbers[k];
                }
                totalSubarray++;
                System.out.println("Sum of subarray: " +sum);
                System.out.println();

            }
            System.out.println();
        }
        System.out.print("total subarrays: " + totalSubarray);

    }
    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        sumSubarray(numbers);
    }
}
