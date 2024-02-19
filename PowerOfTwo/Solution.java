class Solution {
    public boolean isPowerOfTwo(int n) {
        int left=0;
        int right=n;

        while(left<=right)
        {
            int mid=left+(right-left)/2;

            if(Math.pow(2,mid)==n)
            {
                return true;
            }
            else if(Math.pow(2,mid)<n){
               left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
       return false;       
    }
}
