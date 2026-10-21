public class PrefixSum {
    public static void sumSubarray(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        int prefix[] = new int[numbers.length]; //size of prefix array

        prefix[0] = numbers[0]; //sum of 0th element
        //calculate prefix array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            int start =i;

            for (int j = i; j < numbers.length; j++) {
                int end = j;

                currSum = start == 0? prefix[end] : prefix[end] - prefix[start - 1];
                // if start == 0 then currSum = prefix[end] else prefix[end] - prefix[start - 1]

                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.print("max sum: " +maxSum);

    }
    public static void main(String[] args) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        sumSubarray(numbers);
    }
}
