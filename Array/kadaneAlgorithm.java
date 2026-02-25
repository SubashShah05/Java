public class KadaneAlgorithm {

    // Method to find maximum subarray sum
    public static int maxSubarray(int[] arr) {

        // Stores current running sum of subarray
        int currentSum = 0;

        // Stores maximum sum found so far
        int maxSum = Integer.MIN_VALUE;

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {

            // Add current element to running sum
            currentSum += arr[i];

            // Update maximum sum if currentSum is greater
            maxSum = Math.max(maxSum, currentSum);

            // If running sum becomes negative,
            // reset it because negative sum reduces future result
            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        // Return final maximum subarray sum
        return maxSum;
    }

    public static void main(String[] args) {

        // Input array
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        // Calling method and printing result
        System.out.println("Maximum Subarray Sum = " + maxSubarray(arr));
    }
}