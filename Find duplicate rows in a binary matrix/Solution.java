class Solution
{
    public static ArrayList<Integer> repeatedRows(int matrix[][], int m, int n)
    {
        //code here
        HashMap<String,Integer>map=new HashMap<>();
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<m;i++)
        {
            StringBuilder str=new StringBuilder("");
            for(int j=0;j<n;j++)
            {
               str.append(matrix[i][j]); 
            }
            
            if(map.containsKey(str.toString()))
            {
                list.add(i);
            }
            map.put(str.toString(), i);
        }
        return list;
    }
}
