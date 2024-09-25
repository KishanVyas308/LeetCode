class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();     
        for(int n : nums) {
            set.add(n);
        }

        int ans = 0;
        for(int n : nums) {
           if(!set.contains(n-1)) {
            int i = n + 1;
            while(set.contains(i)) {
                i++;
            }
            ans = Math.max(ans, i-n);
           } 
        }

        return ans;
    }
}