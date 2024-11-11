class Solution {
    public boolean primeSubOperation(int[] nums) {
        int limit = -1;
        for (int num : nums) {
            if (num > limit) {
                limit = num;
            }
        }

        boolean[] isPrime = new boolean[1001];
        
        for (int i = 2; i <= limit; i++) {
            isPrime[i] = true;
        }

        for(int i=2; i*i <= 1000; i++) {
            if(isPrime[i]) {
                for(int j = i*i; j<= 1000; j+=i) {
                    isPrime[j] = false;
                }
            }
        }

        int currVal = 1;
        int i=0;
        while(i<nums.length) {
            int dif = nums[i] - currVal;

            if(dif < 0) {
                return false;
            }

            if(isPrime[dif] == true || dif == 0) {
                i++;
                currVal++;
            }
            else {
                currVal++;
            }
        }
        
        return true;
    }
}