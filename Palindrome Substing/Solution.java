class Solution {
    public int countSubstrings(String s) {
        int len=s.length();

        int res=0;
        char c[]=s.toCharArray();
        for(int i=0;i<len;i++)
        {
            res+=isPalindrome(i,i+1,c);
            res+=isPalindrome(i,i,c);
        }

        return res;
    }
    int isPalindrome(int i,int j,char[] c)
    {
        int count=0;

        while(i>=0 && j<c.length  && c[i--]==c[j++])
        {
            count++;
        }
        return count++;
    }

}
