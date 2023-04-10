class Wave_sort{
    public static void main(String[] args) {
       int arr[]={1,3,4,7,5,6,2};
       wave_sort(arr);
    }
    public static void wave_sort(int arr[])
    {
        int n=arr.length;
        for(int i=1;i<=n-1;i+=2)
        {
               if(arr[i]>arr[i-1])
               {
                swap(arr,i,i-1);

               }
               if(arr[i]>arr[i+1] && i<=n-2)
               {
                swap(arr,i,i+1);
               }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }

    }
    public static void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}