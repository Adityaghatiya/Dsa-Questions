class Solution {
    public int maxDepth(String s) {
        int max = 0;
        int depth = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                depth++;
                max = Math.max(max, depth);
            } else if (c == ')') {
                depth--;
            }
        }
        
        return max;
    }
}
