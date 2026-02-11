class Solution {
    public int uniquePaths(int m, int n) {
        int [][] dp=new int [m][n];
        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if( i==0 && j==0){
                    dp [i][j]=1;
                }
                else if(i==0){
                    dp[i][j] = dp[i][j-1];
                }
                else if(j==0){
                    dp[i][j] = dp[i-1][j];
                }
                else
                dp[i][j]=dp[i][j-1] + dp[i-1][j];
            }
        }
        return dp[m-1][n-1];
    }
}
    //TLE
//         return rec(0,0,m,n);
//     }
//     public int rec(int i,int j,int m,int n ){
//         if(i==m-1 && j==n-1){
//             return 1;
//         }
//         if(i>=m || j>=n){
//             return 0;
//         }
//         int x=rec(i,j+1,m,n);
//         int y=rec(i+1,j,m,n);
//         return x+y;   
//     }
// }