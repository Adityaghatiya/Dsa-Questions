class Quicksort{
    public static int parition(int arr[],int low,int high)
    {
        int pivot=arr[low];
        int start=low;
        int end=high;
        while(start<end)
        {
            while(arr[start]<=pivot)
            {
                start++;
            }
            while(arr[end]>pivot)
            {
                end--;
            }
            if(start<end)
            {
                swap(arr,start,end);
            }
        }    
        swap(arr,low,end);
        return end;
    }
    public static void QuickSort(int arr[],int lb,int ub) {
        if(lb<ub)
        {
            int loc=parition(arr,lb,ub);

            QuickSort(arr,lb,loc-1);
            QuickSort(arr,loc+1,ub);
        }
       
    }
    public static void swap(int arr[],int low,int high)
    {
        int temp=arr[low];
        arr[low]=arr[high];
        arr[high]=temp;

    }
    public static void main(String[] args) {
        int arr[]={5,1,8,10,2,6,9,11,7};
        QuickSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
