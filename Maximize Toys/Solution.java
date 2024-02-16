class Solution{
    static int toyCount(int N, int K, int arr[])
    {
        // code here
        Arrays.sort(arr);
        
        int count=0;
        for(int i=0;i<N;i++)
        {
           if(arr[i]<=K)
           {
               count++;
               K=K-arr[i];
           }
        }
        return count;
    }
}
