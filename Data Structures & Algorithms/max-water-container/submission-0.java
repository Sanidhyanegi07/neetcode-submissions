class Solution {
    public int maxArea(int[] heights) {
        int left=0,right=heights.length-1;
        int maxwater=0;
        while(left<right)
        {
            int width=right-left;
            int height=Math.min(heights[left],heights[right]);
            int currarea=width*height;
            maxwater=Math.max(maxwater,currarea);
            if(heights[left]<heights[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return maxwater;
    }
}
