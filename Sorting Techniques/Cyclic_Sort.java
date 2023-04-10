import java.util.*;
class Cyclic_Sort{

    public static void main(String args[])
    {
      int arr[]={5,1,2,6,3};

      sort(arr);
      System.out.println("Required array");
      System.out.println(Arrays.toString(arr));
      
    }
    public static void sort(int arr[])
    {
        int i=0;
        while(i<arr.length)
        {
          int correct=arr[i]-1;
          if(arr[i]<arr.length && arr[i] != arr[correct])
          {
            swap(arr,i,correct);
          }
          else
          {
            i++;
          }
        }
        
    }
    public static void swap(int arr[],int i,int correct) {
      int temp=arr[i];
      arr[i]=arr[correct];
      arr[correct]=temp;
    }
    
}