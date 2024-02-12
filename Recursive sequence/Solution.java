class Solution{
   static int mod = 1000000007;

    static long sequence(int n){
        return fun(1, 1, n);
    }
    
    static long fun(int term, int start, int n) {
        if (term > n) {
            return 0;
        }
        long ans = 1;
        for (int i = 0; i < term; i++) {
            ans = (ans * start) % mod;
            start++;
        }
        ans = (ans + fun(term + 1, start, n)) % mod;
        return ans;
    }
}
