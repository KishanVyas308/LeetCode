class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int[] countChar = new int[26]; 
        int windowSum = 0;
        int windowLen = s1.length();
        for(char ch : s1.toCharArray()) {
            countChar[ch - 'a']--;
            windowSum += (ch - 'a');
        }
        int tempCount = 0;
        for(int i=0; i<windowLen; i++) {
            int  total = (s2.charAt(i) - 'a');
            tempCount += total;
             countChar[total]++;
        }

        for(int i=windowLen; i<s2.length(); i++) {
            if(tempCount == windowSum) {
                boolean check = true;
                for(int j=0; j<26; j++) {
                    if(countChar[j] != 0) {
                        check = false;
                        break;
                    }
                }
                if(check) return true;
            }
            int total = (s2.charAt(i-windowLen) - 'a');
            tempCount -= total;
            countChar[total]--;

            total = (s2.charAt(i) - 'a');
            tempCount += total;
            countChar[total]++;

        }

        if(tempCount == windowSum) {
                boolean check = true;
                for(int j=0; j<26; j++) {
                    if(countChar[s2.length()-1] != 0) {
                        check = false;
                        break;
                    }
                }
                if(check) return true;
            }

        return false;
        
    }
}