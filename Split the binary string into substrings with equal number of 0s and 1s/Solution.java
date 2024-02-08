class Solution {
    public static int maxSubStr(String str) {
       //Write your code here
       
       int count=0;
       int count1=0;
       int ans=0;
       for(int i=0;i<str.length();i++)
       {
           if(str.charAt(i)=='0')
           {
               count++;
           }
           else
           {
               count1++;
           }
           if(count==count1)
           {
               ans++;
               count=0;
               
               count1=0;
           }
       }
       
       if(ans==0)
       {
           return -1;
       }
       return ans;
    }
}
