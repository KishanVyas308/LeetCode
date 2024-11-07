class Solution {
    public int largestCombination(int[] candidates) {
        int ans =0 ;
        for(int i=0; i<32; i++) {
            int ctn = 0;
            for(int can :candidates ) {
                if((can & (1 << i)) != 0) ctn++;
            }
            ans = Math.max(ans, ctn);
        }
        return ans;
    }
}