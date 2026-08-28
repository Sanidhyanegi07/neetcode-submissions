class Solution {
    public int largestRectangleArea(int[] h) {
        Stack<Integer>s=new Stack<>();
        int max=0;
        for(int i=0;i<=h.length;i++)
        {
            int curr=(i==h.length)?0:h[i];
            while(!s.isEmpty() && h[s.peek()]>curr)
            {
                int height=h[s.pop()];
                int width=s.isEmpty()?i:i-s.peek()-1;
                max=Math.max(max,height*width);
            }
            s.push(i);
        }
        return max;
    }
}
