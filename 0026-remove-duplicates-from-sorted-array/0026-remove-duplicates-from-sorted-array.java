class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int ans = 0;
        int index = 0;
        
        for(int num : nums){
            if(!set.contains(num)) {
                set.add(num);
                ans++;
                nums[index++] = num;
            }   
        }

        return ans;
    }
}