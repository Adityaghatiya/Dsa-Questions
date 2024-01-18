class Solution {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        int dp[] = new int[n];
        dp[0] = 1;  // Number of ways to climb 1 step
        dp[1] = 2;  // Number of ways to climb 2 steps

        for (int i = 2; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n - 1];
    }
}

//Second

class Solution {
    public int climbStairs(int n) {
        if (n <= 3) {
            return n;
        }   
        int a = 3;
        int b = 2;
        for (int i = 0; i < n - 3; i++) {
            int temp = a;
            a = a + b;
            b = temp;
        }
        return a;
    }
}
