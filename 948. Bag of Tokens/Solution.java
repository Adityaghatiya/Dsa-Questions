class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        if (tokens.length == 0 || power < 0)
            return 0;
        
        Arrays.sort(tokens);
        int maxScore = 0, score = 0;
        int left = 0, right = tokens.length - 1;

        while (left <= right) {
            if (power >= tokens[left]) {
                power -= tokens[left++];
                maxScore = Math.max(maxScore, ++score);
            } else if (score > 0) {
                power += tokens[right--];
                score--;
            } else {
                break; // No more tokens to buy and no power to gain more
            }
        }

        return maxScore;
    }
}
