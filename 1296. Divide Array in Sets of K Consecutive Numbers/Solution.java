1296. Divide Array in Sets of K Consecutive Numbers

class Solution {
    public boolean isPossibleDivide(int[] hand, int groupSize) {
        int n=hand.length;

        if(n%groupSize!=0)
        {
            return false;
        }
        TreeMap<Integer,Integer>map=new TreeMap<>();

        for(int i=0;i<n;i++)
        {
            map.put(hand[i],map.getOrDefault(hand[i],0)+1);
        }

        while(!map.isEmpty())
        {
            int curr=map.firstKey();

            for(int i=0;i<groupSize;i++)
            {
                if(!map.containsKey(curr+i))
                {
                    return false;
                }

                if(map.get(curr+i)==1)
                {
                    map.remove(curr+i);
                }
                else{
                    map.put(curr+i,map.get(curr+i)-1);
                }
            }
        }

        return true;
    }
}
