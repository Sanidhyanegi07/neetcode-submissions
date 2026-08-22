class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>h=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            h.add(nums[i]);
        }
        int a=0;
        for(int i=0;i<nums.length;i++)
        {
            if(!h.contains(nums[i]-1))
            {
                int count=1;
                int num=nums[i];
                while(h.contains(num+1))
                {
                    num++;
                    count++;
                }
                a=Math.max(a,count);
            }
        }
        return a;
    }
}
