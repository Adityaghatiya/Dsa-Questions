import java.util.ArrayList;
public class Solution
{
    public static int maximumOnesRow(ArrayList<ArrayList<Integer>> matrix, int n, int m)
    {
        //	  Write your code here.
        int max=Integer.MIN_VALUE;
        int index=0;
        for(int i=0;i<matrix.size();i++)
        {   int cnt=0;
            ArrayList<Integer>list=new ArrayList<>(matrix.get(i));
            for(int j=0;j<list.size();j++)
            {
                cnt+=list.get(j);

            }
            if(max<cnt)
            {
                max=cnt;
                index=i;
            }
        }
        return index;
    }
}
