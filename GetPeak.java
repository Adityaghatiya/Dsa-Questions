public class GetPeak  
{  
//user-defined function that finds the peak index of the mountain array  
public static int findPeakIndex(int[] array)   
{  
int low = 0;  
int high = array.length - 1;  
int mid;  
while (low<high)   
{  
mid = low + (high - low) / 2;  
//compares mid of the array with the next element  
if (array[mid] >= array[mid + 1])   
{  
//if the above condition is true, sets high=mid      
high = mid;  
}   
//if the condition becomes false array[mid] >= array[mid + 1] sets low=mid+1  
else   
{  
low = mid + 1;  
}  
}  
return low;  
}  
//driver code  
public static void main(String args[])   
{  
int mountainArray[] = {4, 2, 7, 9, 8, 3, 1};  
//function calling  
int peakindex = findPeakIndex(mountainArray);  
//prints the peak index of the mountain array  
System.out.println("The peak index of the mountain array is: " + peakindex);  
}  
}  