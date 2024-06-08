class Solution {
    public int findExtra(int n, int arr1[], int arr2[]) {
        // add code here.
        int idx=n-1;
        
        int l=0;
        int h=n-2;
        
        
        
         while(l<=h)
         {
             int mid=l+(h-l)/2;
             
             if(arr1[mid]==arr2[mid])
             {
                 l=mid+1;
             }
             else{
                 idx=mid;
                 
                 h=mid-1;
             }
         }
         
         return idx;
    }
}
