class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);  // Step 1: sort the array
        return nums[nums.length / 2]; // Step 2: return middle element
    }
}