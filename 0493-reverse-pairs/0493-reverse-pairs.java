class Solution {

    public void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] lArr = new int[n1];
        int[] rArr = new int[n2];

        for(int i=0; i<n1; i++) {
            lArr[i] = arr[l + i];
        }

        for(int i=0; i<n2; i++) {
            rArr[i] = arr[m + 1 + i];
        }

        int i=0, j=0;

        int k = l;

        while(i < n1 && j < n2) {
            if(lArr[i] <= rArr[j]) {
                arr[k] = lArr[i];
                i++;
            } else {
                arr[k] = rArr[j];
                j++;
            }
            k++;
        }

        while (i<n1) {
            arr[k] = lArr[i];
            i++;
            k++;
        }  
        while (j<n2) {
            arr[k] = rArr[j];
            j++;
            k++;
        }

    }

    public int countPairs(int[] arr, int low, int mid, int high) {
        int right = mid + 1;
        int count = 0;
        for(int i=low; i<=mid; i++) {

            while(right <= high && (long)arr[i] > 2L*arr[right]) right++;
            count += right - (mid+1);

        }
        return count;
    }

    public int mergeSort(int[] arr, int left, int right) {
        int count = 0;
        if(left >= right) return 0;
            int mid = (left + right)/2;

            count += mergeSort(arr, left, mid);
            count += mergeSort(arr, mid+1, right);
            count += countPairs(arr, left, mid, right);
            merge(arr, left, mid, right);
     
            return count;

    }

    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }
}