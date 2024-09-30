class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = 0;
        int curOnes = 0;
        for (int num : nums) {
            if (num == 1)
                curOnes++;
            else {
                maxOnes = Math.max(curOnes, maxOnes);
                curOnes = 0;
            }
        }
        maxOnes = Math.max(curOnes, maxOnes);
        return maxOnes;
    }
}