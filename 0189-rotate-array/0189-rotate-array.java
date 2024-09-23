class Solution {
    public void rotate(int[] arr, int k) {
        int n=arr.length;
        k = k%n;
        doReverse(0,n-1,arr);
        doReverse(0,k-1,arr);
        doReverse(k,n-1,arr);
        
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