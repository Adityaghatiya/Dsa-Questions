class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
         if (k <= 1) // If k is less than or equal to 1, no subarray can satisfy the condition
            return 0;
        
        int i = 0;
        int j = 0;
        int product = 1;
        int count = 0;
        
        while (j < nums.length) {
            product *= nums[j];
            
            while (product >= k) {
                product /= nums[i];
                i++;
            }
            
            count += (j - i + 1); // Count all subarrays ending at j
            j++;
        }
        
        return count;
    }
}
