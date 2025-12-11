class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        Set<Integer> seen=new HashSet<>();
        for(int i=0;i<n;i++){
            seen.add(nums[i]);
        }
        List<Integer> result=new ArrayList<>();
        for(int x=1;x<=n;x++){
            if(!seen.contains(x)){
                result.add(x);
            }
        }
        return result;
        
    }
}