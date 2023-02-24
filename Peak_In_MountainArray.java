class Peak_In_MountainArray
{
  public static int Search(int arr[])
  {
        int start=0;
        int end=arr.length-1;

        
        while(start<=end)
        {
            int mid=(start)+(end-start)/2;

            if(arr[mid]<arr[mid+1])
            {
                start=mid+1;

            }
            else
            {
                end=mid;
            }
        }
         return start;
  }
  public static void main(String args[])
  {
    int arr[]={1,2,3,6,5,4};
    int peak=Search(arr);
    System.out.println(peak);
  }
}