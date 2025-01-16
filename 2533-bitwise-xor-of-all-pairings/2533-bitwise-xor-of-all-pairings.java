class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int ans1 = 0;
        int ans2 = 0;

        for(int num : nums1) {
            ans1 ^= num;
        }
        
        for(int num : nums2) {
            ans2 ^= num;
        }
        return (nums1.length %2 *ans2) ^ (nums2.length % 2 * ans1);
    }
}