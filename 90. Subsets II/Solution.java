class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(nums); // Sort to handle duplicates correctly

        List<Integer> output = new ArrayList<>();
        int index = 0;

        solve(nums, index, output, list);
        return list;
    }

    private void solve(int[] nums, int index, List<Integer> output, List<List<Integer>> ans) {
        if (index == nums.length) {
            if (!ans.contains(output)) {
                ans.add(new ArrayList<>(output));
            }
            return;
        }

        // Exclude
        solve(nums, index + 1, output, ans);

        // Include
        output.add(nums[index]);
        solve(nums, index + 1, output, ans);

        // Backtrack
        output.remove(output.size() - 1);
    }
}
