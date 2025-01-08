class Solution {
    private boolean isVowelString(String s) {
        char first = s.charAt(0);
        char last = s.charAt(s.length() - 1);
        return isVowel(first) && isVowel(last);
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int[] prefixSum = new int[n + 1]; // Create a prefix sum array of size n + 1

        // Fill the prefix sum array
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + (isVowelString(words[i]) ? 1 : 0);
        }

        int m = queries.length;
        int[] ans = new int[m];

        // Answer each query using the prefix sum array
        for (int i = 0; i < m; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            ans[i] = prefixSum[end + 1] - prefixSum[start];
        }

        return ans;
    }
}
