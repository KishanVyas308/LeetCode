class Solution {
    public boolean isCircularSentence(String s) {
        int n = s.length();
        for(int i=0; i<n; i++) {
            if(s.charAt(i) == ' ') {
                if(i>0 && i<n-1) {
                    if(s.charAt(i-1) != (s.charAt(i+1))) return false;
                }
            }
        }
        if(s.charAt(0) != s.charAt(n-1)) return false;
        return true;
    }
}