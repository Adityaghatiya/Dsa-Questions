class Solution {
    public int pivotInteger(int n) {
        int sum=0;
      for(int i=1;i<=n;i++)
      {
         sum+=i;
      }
      int ssum=0;
      for(int j=1;j<=n;j++)
      {
         if(sum-ssum-j==ssum)
         {
            return j;
         }
         ssum+=j;
      }
      return -1;
    }
}
