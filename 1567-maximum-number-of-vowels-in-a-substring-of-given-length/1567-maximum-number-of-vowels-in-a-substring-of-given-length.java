class Solution {
    public int maxVowels(String s, int k) {
        int maxCount = 0;

        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                maxCount++;
            }
        }

        int currentCount = maxCount;
        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                currentCount++;
            }
            if (isVowel(s.charAt(i - k))) {
                currentCount--;
            }
            maxCount = Math.max(currentCount, maxCount);
        }
        return maxCount;
    }

    public boolean isVowel(char val) {
        char[] arr = { 'a', 'e', 'i', 'o', 'u' };
        for (int i = 0; i < 5; i++) {
            if (val == arr[i]) {
                return true;
            }
        }

        return false;
    }
}