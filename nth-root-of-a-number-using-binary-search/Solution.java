public class Solution {
    public static int NthRoot(int n, int m) {
        // Write your code here.

        int low=1;
        int high=m;

        while(low<=high)
        {
            int mid=low+(high-low)/2;

            long val=(long)Math.pow(mid,n);

            if(val==m)
            {
                return mid;
            }
            else if(val>m)
            {
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
}
