class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st = new Stack<>();

        for(String token : tokens) {
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int val2 = Integer.parseInt(st.pop());
                int val1 = Integer.parseInt(st.pop());
                if(token.equals("+") ) {
                    st.push(Integer.toString(val1 + val2) );
                } else if (token.equals("-")) {
                    st.push(Integer.toString(val1 - val2) );
                }else if (token.equals("*")) {
                    st.push(Integer.toString(val1 * val2) );
                    
                }else if (token.equals("/")) {
                    st.push(Integer.toString(val1 / val2 ));
                }
            } else {
                st.push(token);
            }
        }

        return  Integer.parseInt(st.pop());
    }
}