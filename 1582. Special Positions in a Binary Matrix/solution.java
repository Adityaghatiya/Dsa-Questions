class Solution {
    public int numSpecial(int[][] mat) {
        int rowcol[]=new int[mat.length];
        int colcol[]=new int[mat[0].length];
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                 if(mat[i][j]==1)
                 {
                     rowcol[i]++;
                     colcol[j]++;
                 }

            }
        }
        int ans=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                if(mat[i][j]==1)
                {
                    if(rowcol[i]==1 && colcol[j]==1)
                    {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}
