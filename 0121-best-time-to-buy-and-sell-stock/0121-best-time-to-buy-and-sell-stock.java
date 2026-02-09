class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=prices[0];
        int maxProfit=0;
        int n=prices.length;
        for(int i=0;i<n;i++){
            if(prices[i]< minPrice){
                minPrice=prices[i];
            }
            else{
                int profit=prices[i]-minPrice;
                if(profit>maxProfit){
                    maxProfit=profit;
                }
            }    
        }
        return maxProfit;

    }
}        //TLE 
        // int n=prices.length;
        // int maxProfit=0;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if (prices[i] < prices[j]) {
        //             int profit=prices[j]-prices[i];
        //             if(profit > maxProfit){
        //                 maxProfit=profit;
        //             }
        //         }
        //     }
        // }
        // return maxProfit;
        
    
