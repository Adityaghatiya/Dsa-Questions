class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int max=-1;
        for(int i=0;i<s.length()-1;i++)
        {
            char ch=s.charAt(i);
         for(int j=i+1;j<s.length();j++)
            {
                int c=s.charAt(j);
               if(ch==c)
               {
                   int len=j-i-1;
                   max=Math.max(max,len);
               }
            }
        }

        return max;
    }
}
