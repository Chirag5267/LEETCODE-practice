class Solution {
    public int minimumOperations(int[] nums) {
        int op=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%3==0){
                op+=0;
            }
            else if(nums[i] %3==1){
                op+=1;
            }
            else{
                op+=1;
            }
        }
        return op;   
    }
}