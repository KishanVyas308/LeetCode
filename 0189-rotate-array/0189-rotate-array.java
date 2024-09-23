class Solution {
    public void rotate(int[] arr, int k) {
        k = k%arr.length;
        doReverse(0,arr.length-1,arr);
        doReverse(0,k-1,arr);
        doReverse(k,arr.length-1,arr);
        
    }

    public void doReverse(int s, int e, int[] arr) {
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}