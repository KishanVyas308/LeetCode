class Solution {
    public void rotate(int[] nums, int k) {
        int len=nums.length;
        if(len==0){
            return;
        }
        k=k%len;
        if(len==1){
            System.out.print(Arrays.toString(nums));
        }
        List<Integer>list=new ArrayList<>();
        for(int i=len-k;i<len;i++){ 
            list.add(nums[i]);

        }
        for(int i=0;i<len-k;i++){
            list.add(nums[i]);
        }
        for(int i=0;i<len;i++){
            nums[i]=list.get(i);
        }
        
        for(int number:nums){
            System.out.print(number);
        }
    }
}