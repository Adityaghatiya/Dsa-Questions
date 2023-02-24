class Orderedagonistic{
    public static void main(String arsg[])
    {
        // int arr1[]={1,2,3,4,5,6,8};
        int arr1[]={7,6,5,4,3,2,1};
        int target=5;
        int finding=search(arr1,target);
        System.out.println(finding);

    }
    public static int search(int arr[],int target)
    {
        int start=0;
        int end=arr.length-1;
        boolean isAns=arr[start]<arr[end];

        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(target==arr[mid])
            {
                return mid;
            }
            else if(isAns==true)
            {
                if(arr[mid]<target)
                {
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            else
            {
                if(arr[mid]>target)
                {
                    start=mid+1;
                }
                 else{
                end=mid-1;
                }
           }
      
    }
    return -1;
}
}