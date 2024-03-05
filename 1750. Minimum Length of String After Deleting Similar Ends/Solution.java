class Solution {
    public int minimumLength(String s) {
        // char [] arr=new int[s.length];
        int i=0;
        int j=s.length()-1;
        while(i<j && s.charAt(i)==s.charAt(j))
        {
            char ch=s.charAt(i);
           while(i<=j && s.charAt(i)==ch)
           {
               i++;
           }
           while(j>i && s.charAt(j)==ch)
           {
               j--;
           }

        }
        int minLength=j-i+1;
        return minLength;
    }
}
