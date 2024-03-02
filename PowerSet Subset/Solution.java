class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();

        int index = 0;
        solve(nums, output, index, ans);

        return ans;
    }

    private void solve(int[] nums, List<Integer> output, int index, List<List<Integer>> ans) {
        if (index == nums.length) {
            ans.add(new ArrayList<>(output)); // Create a new ArrayList to avoid adding reference
            return;
        }

        // Exclude trying
        solve(nums, output, index + 1, ans);

        // Include trying
        output.add(nums[index]);
        solve(nums, output, index + 1, ans);

        // Backtrack
        output.remove(output.size() - 1);
    }
}
