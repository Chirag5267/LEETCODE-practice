class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tank=0;
        int start=0;
        int total=0;
        for(int i=0;i<gas.length;i++){
            int left=gas[i]-cost[i];
            total=total+left;
            tank=tank+left;

            if (tank<0){
                start=i+1;
                tank=0;
            }
        }
        if (total>=0){
            return start;
        }else {
            return -1;
        }
        
    }
}