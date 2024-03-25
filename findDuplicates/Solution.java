class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n=nums.length;
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
              int num=Math.abs(nums[i]);

              int idx=num-1;
              
              if(nums[idx]<0)
              {
                 list.add(num);
              }
              else{
                nums[idx]*=-1;
              }
        }
        return list;
    }
}
