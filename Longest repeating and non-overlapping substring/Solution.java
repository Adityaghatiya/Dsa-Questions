//Longest Common Substring se same hi hai.. Bs thoda chage hai
class Solution {
    static String longestSubstring(String s, int n) {
        // code here
        
        int dp[][] = new int[n + 1][n + 1];
        int max = 0;
        int end = 0;
        
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(s.charAt(i - 1) == s.charAt(j - 1) && dp[i-1][j-1]<j-i) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 0;
                }
                if(max < dp[i][j]) {
                    max = dp[i][j];
                    end = j;
                }
            }
        }
        
        return max > 0 ? s.substring(end - max, end) : "-1";
    }
};
