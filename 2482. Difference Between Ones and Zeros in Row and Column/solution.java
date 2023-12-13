class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int rowone[]=new int[grid.length];
        int colone[]=new int[grid[0].length];
        int rowzero[]=new int[grid.length];
        int colzero[]=new int[grid[0].length];

        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                    rowone[i]++;
                    colone[j]++;
                }
                else{
                    rowzero[i]++;
                    colzero[j]++;
                }
            }
        }
        int diff[][]=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                diff[i][j]=rowone[i]+colone[j]-rowzero[i]-colzero[j];
            }
        }
        return diff;
    }
}
