class Solution {
    public int minimumLength(String s) {
        int total = 0;
        int[] freq = new int[26];

        for(int i=0; i<s.length(); i++) {
            freq[s.charAt(i)-'a']++;
        }

        for(int i=0; i<26;i++) {
            if(freq[i] == 0) continue;
            if(freq[i] % 2 == 0) total += 2;
            else total++;
        }

        return total;
    }
}