class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int j = 0;
        int ans = 0;
        for (int i = 0; i < houses.length; i++) {
            while (j < heaters.length - 1) {
                int curr = heaters[j] - houses[i];
                if (curr < 0) curr = -curr;
                int next = heaters[j + 1] - houses[i];
                if (next < 0) next = -next;
                if (next <= curr) {
                    j++;
                } else {
                    break;
                }
            }
            int dist = heaters[j] - houses[i];
            if (dist < 0) dist = -dist;

            if (dist > ans) {
                ans = dist;
            }
        }
        return ans;
    }
}
