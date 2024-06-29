// User function Template for Java

class Solution {
    public String pattern(int[][] arr) {
        // Code here
        
        for(int i=0;i<arr.length;i++)
        {
            int start=0;
            int end=arr.length-1;
            boolean flag=true;
            while(start<=end)
            {
                if(arr[i][start]!=arr[i][end])
                {
                    flag=false;
                    break;
                }
                start++;
                end--;
            }
            
            if(flag)
            {
                return i+" "+"R";
            }
        }
        
        for(int i=0;i<arr[0].length;i++)
        {
            int start=0;
            int end=arr[0].length-1;
            boolean flag=true;
            while(start<=end)
            {
                if(arr[start][i]!=arr[end][i])
                {
                    flag=false;
                    break;
                }
                start++;
                end--;
            }
            if(flag)
            {
                return i+" "+"C";
            }
            
        }
        
        return "-1";
    }
}
