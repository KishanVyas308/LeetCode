class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        int prefLen = pref.length();
        int n = words.length;
        for(int i=0; i<n; i++) {
            if(words[i].length() >= prefLen && words[i].substring(0,prefLen).equals(pref)) count++;
        }
        return count;
    }
}