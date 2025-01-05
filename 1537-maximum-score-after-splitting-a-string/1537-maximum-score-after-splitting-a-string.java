class Solution {
    public int maxScore(String s) {
        int left = 0;
        int right = 0;

        if(s.charAt(0) == '0') left = 1;
        
        for(int i=1; i<s.length(); i++) {
            if(s.charAt(i) == '1') right++;
        }

        int max = left + right;

        for(int i=1; i<s.length()-1; i++) {
            if(s.charAt(i) == '0') left++;
            else right--;
            if(max < right + left) max = right + left;

        }

        return max;

    }
}