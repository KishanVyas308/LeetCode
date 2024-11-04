class Solution {
    public String compressedString(String word) {
        StringBuilder st = new StringBuilder();
        int count = 0;
        char cur = word.charAt(0);
        for(char ch : word.toCharArray()){
            if(ch == cur) {
                count++;
                if(count == 9) {
                    st.append(count);
                    st.append(ch);
                    count = 0;
                }
            }
            else {
                st.append(count);
                st.append(cur);
                cur = ch;
                count =1;
            }
        }

         if (count > 0) {
            st.append(count);
            st.append(cur);
        }


        return st.toString();
    }
}