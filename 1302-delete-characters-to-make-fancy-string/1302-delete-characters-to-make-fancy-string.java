class Solution {
    public String makeFancyString(String s) {
        StringBuilder st = new StringBuilder();
        int count = 0;
        char cur = '0';
        for (char ch : s.toCharArray()) {
            if (cur != ch) {
                count = 0;
                cur = ch;
            }
            count++;
            if (count < 3) {
                st.append(ch);
            }

        }
        return st.toString();
    }
}