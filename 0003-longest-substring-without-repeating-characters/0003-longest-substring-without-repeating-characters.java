class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int[] cache = new int[256];
        for(int i=0,j=0; i<s.length(); i++) {
            j = (cache[s.charAt(i)] > 0) ? Math.max(j, cache[s.charAt(i)]) : j;
            cache[s.charAt(i)] = i + 1;
            ans = Math.max(ans, i-j+1);
        }
        return ans;
    }
}