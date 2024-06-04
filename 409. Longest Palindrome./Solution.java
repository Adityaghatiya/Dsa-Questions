class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
        
        char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
       int count=0;
       boolean hasOdd=false;
        for(Map.Entry<Character,Integer>set:map.entrySet())
        {
            int value=set.getValue();
            int key=set.getKey();
            if(value%2==0)
            {
                count+=value;
             
            }
            else{
                count+=value-1;
                hasOdd=true;
            }
        }
       if(hasOdd)
       {
        count+=1;
       }
        return count;
    }
}
