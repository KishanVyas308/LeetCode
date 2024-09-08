class Solution {
    public int maxOperations(int[] nums, int k) {
        int ans = 0;
        int s = 0, e = nums.length-1;
        Arrays.sort(nums);

        while(s<e) {
            if(nums[s] + nums[e] == k) {
                ans++;
                s++;
                e--;
            }
            else if(nums[s] + nums[e] > k) {
                e--;
            }
            else {
                s++;
            }
        }
        return ans;
    }
}