class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int prevalue = 0;
        for(int i=0; i<gain.length; i++) {
           prevalue = prevalue + gain[i];
           max = Math.max(prevalue, max);
        }

        return max;
    }
}