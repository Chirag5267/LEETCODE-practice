class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        int closestSum = nums[0] + nums[1] + nums[2];

        for (int i = 0; i<n - 2; i++) {
            for (int j = i + 1; j<n - 1; j++) {
                for (int k = j + 1; k<n; k++) {

                    int sum = nums[i] + nums[j] + nums[k];
                    int CurrentDiff = sum - target;
                    int ClosestDiff = closestSum - target;
                    if (CurrentDiff < 0) {
                        CurrentDiff = -CurrentDiff;  // negative to postive
                    }
                    if (ClosestDiff < 0){
                         ClosestDiff = -ClosestDiff;
                    }   
                    if (CurrentDiff < ClosestDiff) {
                        closestSum = sum;
                    }
                }
            }
        }
        return closestSum;
    }
}
