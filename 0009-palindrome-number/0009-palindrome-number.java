class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        ArrayList<Integer> arr1 = new ArrayList<>();
        while (x > 0) {
            arr1.add(x % 10);
            x = x / 10;
        }
        int start = 0;
        int end = arr1.size() - 1;
        while (start < end) {
            if (!arr1.get(start).equals(arr1.get(end))) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}