class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder str = new StringBuilder();
        int len = s.length();
        int spIndex = 0;

        for(int i=0; i<len; i++) {
            if(spIndex < spaces.length &&  i == spaces[spIndex]) {
                spIndex++;
                str.append(" ");
            }
            str.append(s.charAt(i));
        }
        return str.toString();
    }
}