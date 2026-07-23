class Solution
{
    public boolean hasDuplicate(int[] n)
    {
        HashSet<Integer> s=new HashSet<>();
        for(int i:n)
        {
            if(s.contains(i))
            {
                return true;
            }
            s.add(i);
        }
        return false;
    }
}