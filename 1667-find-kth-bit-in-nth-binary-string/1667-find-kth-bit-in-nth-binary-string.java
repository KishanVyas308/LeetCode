class Solution {
    public char findKthBit(int n, int k) {
        StringBuilder str = new StringBuilder("0");
        for (int i = 1; i < n; i++) {
            String temp = str.reverse().toString(); 
            str.reverse(); 
            str.append("1");
            for (char ch : temp.toCharArray()) {
                if (ch == '1') {
                    str.append('0');  
                } else {
                    str.append('1');
                }
            }
        }
        return str.charAt(k - 1);

        
    }
}