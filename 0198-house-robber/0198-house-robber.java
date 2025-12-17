class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int prev2=0;
        int prev1=0;
        for(int i=0;i<n;i++){
            int take=prev2+ nums[i];
            int skip=prev1;
            int curr;
            if(take>skip){
                curr=take;
            }else{
                curr=skip;
            }
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
        
    }
}