class Solution {
    public int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        int i = 0, j = n - 1; //nums indices
        int k = n - 1;  //result indices

        while (k >= 0) {

            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                result[k] = nums[i] * nums[i];
                i++;
            } else {
                result[k] = nums[j] * nums[j];
                j--;
            }

            k--;
        }

        return result;
    }
}