class Solution {
    public int[] diStringMatch(String s) {
        int lower=0;
        int high=s.length();

        int arr[]=new int[high+1];

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='I')
            {
                arr[i]=lower;
                lower++;
            }
            else
            {
                arr[i]=high;
                high--;
            }
        }
        arr[s.length()]=lower;

        return arr;
    }
}
