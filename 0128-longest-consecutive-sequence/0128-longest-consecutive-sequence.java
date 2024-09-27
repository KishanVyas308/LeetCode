class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        for(int n : nums) {
            set.add(n);
        }

        int longest = 1;
        for(int st : set) {
            if(!set.contains(st-1)){
                int cnt = 1;
                int temp = st;
                while(set.contains(temp+1)) {
                    temp++;
                    cnt++;
                }
                longest = Math.max(cnt, longest);
            }
        }
        return longest;
    }
}