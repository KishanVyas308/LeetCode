class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length + 1];
        Map<Integer, Integer> fmap = new HashMap<Integer,Integer>(0);

        for(int n:nums) {
            fmap.put(n, fmap.getOrDefault(n,0) + 1);
        }

        for(int key : fmap.keySet()) {
            int fre = fmap.get(key);
            if(bucket[fre] == null) {
                bucket[fre] = new ArrayList<>();
            }
            bucket[fre].add(key);
        }

        int[] result = new int[k];
        int index = 0;

        for (int i = bucket.length - 1; i >= 0 && index < k; i--) {
            if (bucket[i] != null) {
                for (int num : bucket[i]) {
                    if (index < k) {
                        result[index++] = num;
                    } else {
                        break;
                    }
                }
            }
        }

        return result;
        
    }
}