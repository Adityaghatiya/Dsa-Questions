class Solution
{
    public int maxSum(int n) 
    { 
        //code here.
        return help(n);
    } 
    public int help(int n)
    {
        if(n==0)
        {
            return 0;
        }
        int sum=help(n/2)+help(n/3)+help(n/4);
        
        if(sum>=n)
        {
            return sum;
        }
        return n;
    }
}
