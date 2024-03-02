class Solution {
   public List<String> letterCombinations(String digits) {
        String[] str = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> ans = new ArrayList<>();
        int len = digits.length();
        if (len == 0) {
            return ans;
        }
        StringBuilder output = new StringBuilder();
        solve(digits, len, ans, str, output, 0);

        return ans;
    }

    private void solve(String digits, int len, List<String> list, String[] str, StringBuilder output, int index) {
        if (index == len) {
            list.add(output.toString());
            return;
        }
        int number = digits.charAt(index) - '0';
        String value = str[number];

        for (int i = 0; i < value.length(); i++) {
            output.append(value.charAt(i));
            solve(digits, len, list, str, output, index + 1);
            output.setLength(output.length() - 1);
        }
    }
}
