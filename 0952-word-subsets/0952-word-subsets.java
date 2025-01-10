class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] maxCounts = new int[26];
        
        // Compute the maximum frequency for each character in words2
        for (String word : words2) {
            int[] tempCounts = new int[26];
            for (char c : word.toCharArray()) {
                tempCounts[c - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                maxCounts[i] = Math.max(maxCounts[i], tempCounts[i]);
            }
        }

        List<String> result = new ArrayList<>();
        
        // Check each word in words1
        for (String word : words1) {
            int[] wordCounts = new int[26];
            for (char c : word.toCharArray()) {
                wordCounts[c - 'a']++;
            }
            
            boolean isSubset = true;
            for (int i = 0; i < 26; i++) {
                if (wordCounts[i] < maxCounts[i]) {
                    isSubset = false;
                    break;
                }
            }
            
            if (isSubset) {
                result.add(word);
            }
        }

        return result;
    }
}