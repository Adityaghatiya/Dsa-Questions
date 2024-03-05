class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<tasks.length;i++)
        {
            map.put(tasks[i],map.getOrDefault(tasks[i],0)+1);
        }
        int result=0;
        for(Map.Entry<Integer,Integer>entry:map.entrySet())
        {
            if(entry.getValue()==1)
            {
                return -1;
            }
            if(entry.getValue()%3==0)
            {
                result+=entry.getValue()/3;
            }
            else
            {
                result+=entry.getValue()/3+1;
            }

        }
        return result;
    }
}
