class Solution {
    public String makeGood(String s) {
          Stack<Character> stk = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (!stk.isEmpty() && (Math.abs(stk.peek() - ch) == 32)) {
                stk.pop();
            } else {
                stk.push(ch);
            }
        }

        StringBuilder str = new StringBuilder();

        while (!stk.isEmpty()) {
            str.insert(0, stk.pop()); // Insert characters at the beginning to maintain order
        }

        return str.toString();
    }
}
