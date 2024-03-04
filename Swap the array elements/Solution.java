class Solution
{
    public void swapElements(int[] arr, int n)
    {
        // Code here
        
        for(int i=0;i<n;i++)
        {
            if(i+2<n)
            {
                swap(i,i+2,arr);
            }
        }
    }
    public void swap(int i,int j,int arr[])
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
