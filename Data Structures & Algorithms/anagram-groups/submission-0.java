class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String,ArrayList<String>>h=new HashMap<>();
       for(int i=0;i<strs.length;i++)
       {
        char ch[]=strs[i].toCharArray();
        Arrays.sort(ch);
        String key=new String(ch);
        if(!h.containsKey(key))
        {
            h.put(key,new ArrayList<>());
        }
        h.get(key).add(strs[i]);
    }
    List<List<String>>l=new ArrayList<>(h.values());
    return l;
}
}
