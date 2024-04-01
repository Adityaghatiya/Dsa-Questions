class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int maxLeft=0;
        for(int i=0;i<left.length;i++)
        {
            maxLeft=Math.max(left[i],maxLeft);
        }
        int maxRight=0;

        for(int i=0;i<right.length;i++)
        {
            maxRight=Math.max(maxRight,n-right[i]);
        }

        return Math.max(maxRight,maxLeft);
    }
}
