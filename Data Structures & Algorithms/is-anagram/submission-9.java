class Solution
{
    public boolean isAnagram(String s, String t)
    {
        char[] sa = s.toCharArray();
        char[] ta = t.toCharArray();
        if(sa.length != ta.length)
        { 
            return false;
        }
        Arrays.sort(sa);
        Arrays.sort(ta);
        for(int i=0;i<sa.length;i++)
        {
            if(sa[i]!=ta[i])
            {
                return false;
            }
        }    
        return true;
    }
}