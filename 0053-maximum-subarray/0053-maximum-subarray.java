class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];  // Start with first element
        int maxSum = nums[0];      // Best answer so far

        for (int i = 1; i < nums.length; i++) {
            // Either take current element alone or extend the previous subarray
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
