
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