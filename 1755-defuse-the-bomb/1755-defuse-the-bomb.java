class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] res = new int[n];

        for(int index = 0; index < n; index++) {
            for(int i=k; i !=0; i+=k > 0 ? -1 : 1) {
                res[index] += code[(index + i + n) % n];
            }
        }

        return res;
    }
}