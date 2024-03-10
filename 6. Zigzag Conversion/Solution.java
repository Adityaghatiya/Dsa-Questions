class Solution {
    public String convert(String s, int numRows) {
        
        int len=s.length();
        StringBuilder[] str=new StringBuilder[numRows];

        for(int i=0;i<numRows;i++)
        {
            str[i]=new StringBuilder();
        }
        int i=0;

        while(i<len)
        {
            for(int ind=0;ind<numRows && i<len ;ind++)
            {
               str[ind].append(s.charAt(i));
               i++;
            }

            for(int idx=numRows-2;idx>0 && i<len;idx--)
            {
                str[idx].append(s.charAt(i));
                i++;
            }
        }

        StringBuilder sst=new StringBuilder();

        for(int j=0;j<numRows;j++)
        {
            sst.append(str[j]);
        }
        return sst.toString();
    }
}
