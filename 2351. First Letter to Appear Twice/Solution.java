class Solution {
    public char repeatedCharacter(String s) {
        HashMap<Character,Integer>map=new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(!map.containsKey(ch))
            {
                map.put(ch,1);
            }
            else
            {
                return ch;
            }

        }
        return  '\0';
    }
}
