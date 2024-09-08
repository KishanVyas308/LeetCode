class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for (int i=0; i<nums.length; i++) {
            total += nums[i];
        }
        int left = 0;
        int right = total;
        for(int i=0; i<nums.length; i++) {
            right = right - nums[i];
            if(left == right) return i;
            left += nums[i];
        }
        return -1;
    }
}