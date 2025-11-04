class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //ADDING BOTH ARRAY TO ONE AND SORITNG
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
        // Arrays.sort(nums1);
        // Arrays.sort(nums2);
        // for(int i=0;i<n.lenght;i++){
        //    nums1=nums1+nums2;
        //     return
        // }
        
    }
}