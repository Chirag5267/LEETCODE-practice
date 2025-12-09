class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxArea=0;
        while(left<right){
            int h;
            if (height[left]< height[right]){
                    h=height[left];
                }else{
                    h=height[right];
                }
                int width=right-left;
                int Area=h*width;
                if(Area> maxArea){
                    maxArea=Area;
                }
                if (height[left]<height[right]){
                    left++;
                }else{
                    right--;
                }
            }
            return maxArea;
            
        }
}        
        //BRUTE FORCE  GOT TLE
    //     int n=height.length;
    //     int maxArea=0;
    //     for (int i=0;i<n;i++){
    //         for(int j=i+1;j<n;j++){
    //             int h;
        //         if (height[i]< height[j]){
        //             h=height[i];
        //         }else{
        //             h=height[j];
        //         }
        //         int width=j-i;
        //         int Area=h*width;
        //         if(Area> maxArea){
        //             maxArea=Area;
        //         }
        //     }
            
        // }
        // return maxArea;
        
    // }
