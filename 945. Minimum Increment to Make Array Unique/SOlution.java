class Solution {
    public int minIncrementForUnique(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {
            max=Math.max(nums[i],max);
        }
        int arr[]=new int[n+max];
        int count=0;
        for(int i=0;i<n;i++)
        {
            arr[nums[i]]++;
        }
        for(int i=0;i<n+max;i++)
        {
          if(arr[i]<=1)
          {
            continue;
          }
           int duplicate=arr[i]-1;

           arr[i+1]+=duplicate;
           arr[i]=1;
           count+=duplicate;

        }


        return count;
    }
}
