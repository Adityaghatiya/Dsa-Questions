class FindElement_InfiniteArray{
    public static int ans( int arr[],int target)
    {
      int start=0;
      int end=1;
      while(target>end)
      {
        int newStart=end;
        end=end+(end-start+1)*2;
        start=newStart;
      }
      return Search(arr,target, start, end);
    }
    static int Search(int arr[],int target,int start,int end)
    {
       while(start<=end)
        {
            int mid=(start)+(end-start)/2;

            if(target<arr[mid])
            {
                end=mid-1;

            }
            else if(target>arr[mid])
            {
                start=mid+1;
            }
            else
            {
                return mid;
            }
           
        }
         return -1;
    }
    public static void main(String args[])
    {
        int arr[]={1,2,3,18,20,44,55,60,80,81,88,90};
        
        int target=90;
       System.out.println( ans(arr,target));
    }

}