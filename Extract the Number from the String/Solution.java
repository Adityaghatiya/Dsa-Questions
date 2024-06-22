class Solution {
    long ExtractNumber(String s) {
        // code here
        int n=s.length();
        int i=0;
        long result=-1;
        while(i<n)
        {
            if(s.charAt(i)>='0' && s.charAt(i)<='9')
            {
                long no=0;
                boolean nine=false;
                while(i<n && s.charAt(i)>='0' && s.charAt(i)<='9')
                {
                    int val=s.charAt(i)-'0';
                    
                    no=no*10+val;
                    
                    if(val==9)
                    {
                        nine=true;
                    }
                    i++;
                }
                if(!nine)
                {
                   result=Math.max(result,no);  
                }
            }
            else{
                i++;
            }
        }
        return result;
    }
}
