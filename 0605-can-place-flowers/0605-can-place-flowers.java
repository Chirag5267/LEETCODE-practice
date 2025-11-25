class Solution {
    public boolean canPlaceFlowers(int[] fl, int n) {
        if(n==0)return true;
        for (int i=0;i<fl.length;i++){
            if (fl[i]==0){
                //check left and rigth is empty or not
                boolean left=(i==0)  || (fl[i-1]==0);
                boolean right=(i==fl.length-1) ||  (fl[i+1]==0);
                if (left&&right){
                    fl[i]=1;
                    n--;
                 }
            }
         } 
         return n<=0;  
    }
}    
