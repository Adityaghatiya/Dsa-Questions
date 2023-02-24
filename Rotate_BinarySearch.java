// https://leetcode.com/problems/search-in-rotated-sorted-array/
class Rotate_BinarySearch{
    public static void main(String args[])
    {
        int arr[]={3,4,5,1,2};
        // int target=2;
       System.out.println(Search( arr)) ;
    }
    
    public static int Search(int arr[])
    {
        int start=0;
        int end=arr.length-1;

        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid+1])
            {
                return mid-1;
            }
            else if(arr[start]>arr[mid])
            {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
   
}