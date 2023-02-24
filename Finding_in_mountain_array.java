class Finding_in_mountain_array{
    public static void main(String args[])
    {
        int[] arr={1,2,3,4,8,3,1};
        int target=3;
        search(arr,target);
    }
    public static  int search(int arr[],int target)
    {
        int peak=peakofelement( arr);

        System.out.println("The peak of the given array="+peak);
        int firstblog=Orderedagonistic(arr,target,0,peak);
        if(firstblog!=-1)
        {
            return firstblog;
        }
        return Orderedagonistic(arr,target,peak+1,arr.length-1);
    }
    public static int peakofelement(int arr[])
    {
        int start=0;
        int end=arr.length-1;

        while(start<end)
        {
            int mid=start+(end-start)/2;

            if(arr[mid]<arr[mid+1])
            {
               start=mid+1;   
            }
            else{
                end=mid;
            }

        }
        return arr[start];
    }
    public static int Orderedagonistic(int arr[],int target,int start,int end)
    {
        boolean isAns=arr[start]<arr[end];
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
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
            else{
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