class Solution {
    static int maxSquare(int n, int m, int mat[][]) {
        // code here
        int max=0;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i!=0 && j!=0 && mat[i][j]!=0)
                {
                    mat[i][j]=mat[i][j]+Math.min(mat[i][j-1],Math.min(mat[i-1][j-1],mat[i-1][j]));
                    
                }
                max=max<mat[i][j]?mat[i][j]:max;
            }
        }
        
        return max;
    }
}
