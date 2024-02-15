class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int total=0;

        for(int i=0;i<nums.length;i++)
        {
            total=total+nums[i];

        }
        int cur_sum=0;
        for(int i=nums.length-1;i>=0;i--)
        {   cur_sum=cur_sum+nums[i];
            int rem=total-cur_sum;

            if(rem>nums[i])
            {
                return rem+nums[i];
            }
        }
        return -1;
    }

}
