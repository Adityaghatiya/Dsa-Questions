public class Solution {

    public static void mergeSort(int[] arr, int l, int r){
        // Write your code here
        int mid=l+(r-l)/2;

        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);

        conquer(arr,l,mid,r);

    }
    public static void conquer(int arr[],int l,int mid,int r)
    {
        int merge[]=new int[r-l+1];
        int ind1=l;
        int ind2=mid;
        int x=0;

        while(ind1<=mid && ind2<=r)
        {
            if(arr[ind1]<=arr[ind2])
            {
                merge[x]=arr[ind1];
                x++;
                ind1++;
            }
            else{
                merge[x]=arr[ind2];
                x++;
                ind2++;
            }
        }
        while(ind1<=mid)
        {
            merge[x]=arr[ind1];
                x++;
                ind1++;
            }
        }
        while(ind2<r)
        {
            merge[x]=arr[ind2];
                x++;
                ind2++;
        }
        for(int i=0;i<merge.length;i++)
        {
            arr[i]=merge[i];
        }
    }
}
