class Solution:
    def minAddToMakeValid(self, s: str) -> int:
        st = []
        for i in s:
            if i == '(' :
                st.append('(')
            else :
                if not st or st[-1] == ')':
                    st.append(')')
                else :
                    st.pop()
        return len(st)