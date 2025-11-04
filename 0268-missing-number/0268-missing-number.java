class Solution {
    public int missingNumber(int[] nums) {
        //BY SUM FORMULA
        int sum=0;
        int total=nums.length*(nums.length+1)/2;
        
        for (int i=0;i<nums.length;i++) {
            sum = sum + nums[i];
        }
        int missing=total-sum;
        return missing;

        
        
    }
}