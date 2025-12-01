class Solution {
    public int climbStairs(int n) {
        // int step=0;
        // while(n>0){
        //     step=n;
        // }
        // return step;
        if(n<=2) return n;
        int a=1;
        int b=2;
        for(int i=3;i<=n;i++){
            int c=a+b;
            a=b;
            b=c;
        }
        return b;
    }
}