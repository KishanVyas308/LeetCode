class Solution {
    public boolean isSubsequence(String s, String t) {

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        int count = 0;

        for(int i=0; i<arr2.length && count<arr1.length; i++) {
            if(arr2[i] == arr1[count]) {
                count++;
            }
        }

        if(count == arr1.length) return true;

        return false;
        
    }
}