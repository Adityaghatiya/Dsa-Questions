class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int max=1;
        for(int i=0;i<nums.length;i++)
        {
            int count = map.getOrDefault(nums[i], 0) + 1;
            map.put(nums[i], count);
            max = Math.max(max, count);
        }
        int count=0;
        for(Map.Entry<Integer,Integer>entry:map.entrySet())
        {
            if(entry.getValue()==max)
            {
              count+=entry.getValue();
            }
        }
        return count;
    }
}
