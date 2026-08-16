class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> h=new HashMap<>();
        int arr[]=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            int a=target-nums[i];
            if(h.containsKey(a))
            {
                int j=h.get(a);
                arr[0]=j;
                arr[1]=i;
                break;
            }
            h.put(nums[i],i);
        }
        return arr;
    }
}
