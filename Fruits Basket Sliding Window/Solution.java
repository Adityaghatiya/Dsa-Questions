class Solution {
   
    public static int totalFruits(int N, int[] fruits) {
        
        int j=0;
        int  i=0;
        int result=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        while(j<N)
        {   
            map.put(fruits[j],map.getOrDefault(fruits[j],0)+1);
            
            while(map.size()>2)
            {
                if(map.get(fruits[i])>1)
                {
                    map.put(fruits[i],map.get(fruits[i])-1);
                }
                else
                {
                    map.remove(fruits[i]);
                }
                i++;
            }
            
            if(map.size()==2)
            {
               result=Math.max(result,j-i+1); 
            }
            j++;
        }
        
        return result;
    }
}
