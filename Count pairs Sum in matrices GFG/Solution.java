// TLE wala
class Solution {
    int countPairs(int mat1[][], int mat2[][], int n, int x) {
        // code 
        ArrayList<Integer>list1=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                list1.add(mat1[i][j]);
            }
        }
        
        ArrayList<Integer>list2=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                list2.add(mat2[i][j]);
            }
        }
        int count=0;
        for(int i:list1)
        {
            for(int j:list2)
            {
               int k=x-i;
               if(k==j)
               {
                   count++;
               }
            }
        }
       return count;
    }
}

// Sahi wala
class Solution {
    int countPairs(int mat1[][], int mat2[][], int n, int x) {
        // code 
        Set<Integer>list1=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                list1.add(mat1[i][j]);
            }
        }
        int count=0;
       
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {     int k=x-mat2[i][j];
            
               if(list1.contains(k))
               {
                   count++;
               }
                
            }
        }
     
       
       return count;
    }
}
