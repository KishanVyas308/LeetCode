class Solution {
    public boolean rotateString(String s, String gole) {
        int n = s.length();
        if(n != gole.length()) return false;
      
        for(int i=0; i<n; i++) {
            if(s.charAt(i) == gole.charAt(0)) {
                int j=0;
                while(j<n) {
                    if(gole.charAt(j) != s.charAt((i+j) % n)) {
                        break;
                    }
                    j++;
                }
                if(j == n) return true;
            }
        }

        return false;
    }
}