class Solution {
    public int shipWithinDays(int[] weight, int days) {
        int low=Integer.MIN_VALUE;
        int high=0;
        for(int i=0;i<weight.length;i++)
        {
            low=Math.max(low,weight[i]);
            high=high+weight[i];
        }

        while(low<=high)
        {
            int mid=low+(high-low)/2;

            int numOfDay=findDay(weight,mid);

            if(numOfDay<=days)
            {
               high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return low;
    }
    public int findDay(int weight[],int cap)
    {
        int day=1;
        int load=0;

        for(int i=0;i<weight.length;i++)
        {
            if(weight[i]+load>cap)
            {
                day+=1;
                load=weight[i];
            }
            else{
                load+=weight[i];
            }
        }
        return day;
    }
}
