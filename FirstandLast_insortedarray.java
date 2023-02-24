// 34. Find First and Last Position of Element in Sorted Array
class FirstandLast_insortedarray{
    public static void main(String args[])
    {
        int arr[]={5,7,7,8,8,10};
        int target=8;
        int ass=Search(arr,target);
       System.out.println(ass);

    }
    public static int [] Search(int arr[],int target){
       int ar[]={-1,-1};
       int s=search_start(arr,target,true);
       int e=search_start(arr,target,false);
       ar[0]=s;
       ar[1]=e; 
       return ar;

    }
    public static int search_start(int arr[],int target,boolean findstart)
    {
        int ans=-1;
        int start=0;
        int end=arr.length-1;

        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target<arr[mid])
            {
                end=mid-1;

            }
            else if(target>arr[mid])
            {
                start=mid+1;
            }
            else{
                ans=mid;
                if(findstart==true)
                {
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}