class Solution {
    public boolean find132pattern(int[] nums) {
        Stack <Integer> st=new Stack<>();
        int num=Integer.MIN_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            int val=nums[i];
            if(val<num)return true;
            while(!st.isEmpty() && val>st.peek()){
                num=st.pop();
            }
            st.push(val);
        }
        return false;
    }
}