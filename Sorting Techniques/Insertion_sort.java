class Insertion_sort{
    public static void main(String args[])
    {
       int arr[]={12,45,23,51,19,8};
       Insertion_sort(arr);
    }
    public static void Insertion_sort(int arr[]) {
        int temp;
        for(int i=1;i<arr.length;i++)
        {
            temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    
}