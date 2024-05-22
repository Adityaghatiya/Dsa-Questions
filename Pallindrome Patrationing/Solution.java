import java.util.ArrayList;
import java.util.List;

class Solution {
    int n;

    public List<List<String>> partition(String s) {
        n = s.length();

        List<String> curr = new ArrayList<>();
        List<List<String>> result = new ArrayList<>();

        backtrack(s, 0, result, curr);

        return result;
    }

    public void backtrack(String s, int idx, List<List<String>> result, List<String> curr) {
        if (idx == s.length()) {
            result.add(new ArrayList<>(curr));  // Create a new list to avoid reference issues
            return;
        }

        for (int i = idx; i < n; i++) {
            if (isPalindrome(s, idx, i)) {
                curr.add(s.substring(idx, i + 1));  // Include end index for the substring
                backtrack(s, i + 1, result, curr);
                curr.remove(curr.size() - 1);  // Remove the last added substring
            }
        }
    }

    public boolean isPalindrome(String s, int idx, int i) {
        while (idx < i) {
            if (s.charAt(idx) != s.charAt(i)) {
                return false;
            }
            idx++;
            i--;
        }
        return true;
    }
}
