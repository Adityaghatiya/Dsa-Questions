class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer>map=new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);

            if(map.containsKey(c))
            {
                int v=map.get(c);
                map.put(c,v+1);

            }
            else{
                map.put(c,1);
            }
        }
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(map.get(c)==1)
            {
                return i;
            }
        }
        return -1;
    }
}
