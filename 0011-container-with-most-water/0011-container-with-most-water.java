class Solution {
    public int maxArea(int[] height) {
        
        int max = 0;
        int s = 0, e = height.length - 1;

        while(s<e) {
            int temp=0;
            if(height[s] < height[e]) temp = height[s];
            else temp = height[e];

            if((e-s)*temp > max) max = (e-s)*temp;

            if(height[s] < height[e]) s++;
            else if(height[s] >= height[e]) e--;
            
        }

        return max;
    }
}