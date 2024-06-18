826. Most Profit Assigning Work
  class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int max=0;
        for(int i=0;i<worker.length;i++)
        {
          max=Math.max(max,worker[i]);
        }

        int arr[]=new int[max+1];

        for(int i=0;i<profit.length;i++)
        {
            if(difficulty[i]<=max)
            {
                arr[difficulty[i]]=Math.max(arr[difficulty[i]],profit[i]);
            }
        }
        
        for(int i=1;i<arr.length;i++)
        {
            arr[i]=Math.max(arr[i-1],arr[i]);
        }
        int netProfit=0;
        for(int i=0;i<worker.length;i++)
        {
            netProfit+=arr[worker[i]];
        }

        return netProfit;
    }
}
