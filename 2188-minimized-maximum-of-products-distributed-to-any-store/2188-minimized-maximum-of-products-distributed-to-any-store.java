class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int l = 1, r = 100000;
        while(l < r) {
            int mid = (l + r)/2;
            int sum = 0;
            for(int q : quantities) {
                sum += (q + mid - 1) / mid;
            }
            if(sum > n) l = mid + 1;
            else r = mid;
        }
        return l;
    }
}