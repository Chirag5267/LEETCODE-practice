class Solution {
    public int countHillValley(int[] nums) {
        // Step 1: Remove consecutive duplicates into a new array
        int n = nums.length;
        int[] arr = new int[n];
        int k = 0;
        arr[k++] = nums[0];  // always take the first element

        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1]) { 
                arr[k++] = nums[i];
            }
        }

        // Step 2: Count hills and valleys
        int count = 0;
        for (int i = 1; i < k - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                count++; // hill
            } else if (arr[i] < arr[i - 1] && arr[i] < arr[i + 1]) {
                count++; // valley
            }
        }

        return count;
    }
}