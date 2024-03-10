class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(find(nums2, nums1));
        list.add(find(nums1, nums2));

        return list;
    }

    public static List<Integer> find(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();

        for (int n1 : nums1) {
            set.add(n1);
        }

        Set<Integer> resultSet = new HashSet<>();

        for (int n2 : nums2) {
            if (!set.contains(n2)) {
                resultSet.add(n2);
            }
        }

        return new ArrayList<>(resultSet);
    }
}
