class count_pivot{
    public static int pivoted_count(int arr[])
    {
        int pivoted=search(arr);

        return pivoted+1;
    }
    public static int search(int arr[])
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
            if(start<mid && arr[mid]<arr[mid-1])
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
public static void main(String args[])
{
    int arr[]={4,5,6,7,1,2,3};
    // Search(arr[]);
   System.out.println( pivoted_count(arr));
}
}