// https://leetcode.com/problems/find-smallest-letter-greater-than-target/c
class Smallest_number{
    public static void main(String args[])
    {
        char arr[]={'c','f','j'};
        char target='d';
        System.out.println(Search(arr,target));
    }
    public static char Search(char arr[],char target)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;

            
             if(target>arr[mid])
            {
                start=mid+1;
            }
            else 
            {
                end=mid-1;
            }


        }
        return arr[start%arr.length];
    }
}