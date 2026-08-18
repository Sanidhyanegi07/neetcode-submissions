class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int arr[]=new int[k];
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(h.containsKey(nums[i]))
            {
                h.put(nums[i],h.get(nums[i])+1);
            }
            else
            {
                h.put(nums[i],1);
            }
        }
        int j=0;
        while(j<k)
        {
            int max=0;
            int topkey=0;
            for(int key : h.keySet())
            {
                if(h.get(key)>max)
                {
                    max=h.get(key);
                    topkey=key;
                }
            }
            arr[j]=topkey;
            h.remove(topkey);
            j++;
        }
        return arr;
    }
}