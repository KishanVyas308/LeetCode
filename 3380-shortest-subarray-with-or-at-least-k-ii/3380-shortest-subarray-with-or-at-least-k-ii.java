class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        int[] count = new int[32];
        int s = 0, e = 0, min = Integer.MAX_VALUE;
        while(e<nums.length) {
            updateBits(count, nums[e], 1);
            while(s <= e && getVal(count) >= k) {
                min = Math.min(min, e-s+1);
                updateBits(count, nums[s], -1);
                s++;
            }
            e++;
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
    public void updateBits(int count[], int num, int val) {
        for(int i=0; i<32; i++) {
            if(((num >> i) & 1) == 1) count[i] += val;
        }
    }

    public int getVal(int[] count) {
        int ans = 0;
        for(int i=0; i<32; i++) {
            if(count[i] > 0) ans = ans | (1 << i);
        }
        return ans;
    }
}