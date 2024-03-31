class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int minPosition = -1;
        int maxPosition = -1;
        int leftBound   = -1;
          long ans = 0;
        for(int i = 0; i < nums.length; i++) {
            
            if(nums[i] < minK || nums[i] > maxK)
                leftBound = i;
            
            if(nums[i] == minK)
                minPosition = i;
            if(nums[i] == maxK)
                maxPosition = i;
            
            int count = Math.min(maxPosition, minPosition) - leftBound;
            
            ans += (count <= 0) ? 0 : count;
            
        }
        return ans;
    }
}
