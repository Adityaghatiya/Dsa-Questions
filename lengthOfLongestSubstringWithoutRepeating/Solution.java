class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();

        int max = 0;
        int count = 0;
        int i = 0;
        int j = 0;
        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
                count = j - i; // Update count to reflect the current substring length
                max = Math.max(count, max);
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }
}
