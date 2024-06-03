class Solution {
    public int appendCharacters(String s, String t) {
        int i=0;
        int j=0;
        
        int len1=s.length();

        int len2=t.length();
        // int count=0;
        while(i<len1 && j<len2)
        {
            if(s.charAt(i)==t.charAt(j))
            {
                i++;
                j++;
                continue;

            }
            else
            {
                i++;
            }
        }
        
        int c=len2-j;

        return c;
    }
}
