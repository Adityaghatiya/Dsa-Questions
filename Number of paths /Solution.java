class Solution{
    
    long numberOfPaths(int M, int N) {
        // Code Here
        int matrix[][]=new int[M][N];
 
         for(int i=0;i<M;i++)
         {
             matrix[0][i]=1;
             
            //  mat
         }
         for(int j=0;j<N;j++)
         {
             matrix[j][0]=1;
         }
         
         for(int i=1;i<M;i++)
         {
             for(int j=1;j<N;j++)
             {
                 matrix[i][j]=matrix[i][j-1]+matrix[i-1][j];
             }
         }
         return matrix[M-1][N-1];
    }
    
}
