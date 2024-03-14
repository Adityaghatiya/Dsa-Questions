class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
         return atmost(nums, goal) - atmost(nums, goal - 1);
    }

    public int atmost(int[] nums, int goal) {
        int start = 0;
        int ans = 0;
        int sum = 0;

        for (int end = 0; end < nums.length; end++) {
            sum += nums[end];

            while (sum > goal && start <= end) {
                sum -= nums[start];
                start++;
            }
            ans += end - start + 1;
        }
        return ans;
    }
}
