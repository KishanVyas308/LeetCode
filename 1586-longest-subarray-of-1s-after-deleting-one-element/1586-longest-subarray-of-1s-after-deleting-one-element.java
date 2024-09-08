class Solution {
    public int longestSubarray(int[] nums) {
       int left = 0;
       int remainZero = 0;
       int ans = 0;

       for(int right=0; right<nums.length; right++) {
            if(nums[right] == 0) {
                remainZero++;
            }

            while(remainZero > 1) {
                if(nums[left] == 0) {
                    remainZero--;
                }
                left++;
            }
            ans = Math.max(ans,right-left+1-remainZero);
       }

       if(ans == nums.length) return ans -1;
       return ans;
    }
}