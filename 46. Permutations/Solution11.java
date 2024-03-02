class Solution {
    public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>>ans=new ArrayList<>();

       recursPermute(ans,nums,0);
       return ans; 
    }
    public void recursPermute(List<List<Integer>>ans,int nums[],int index)
    {
        if(index==nums.length)
        {
            List<Integer>list=new ArrayList<>();
            for(int i=0;i<nums.length;i++)
            {
                list.add(nums[i]);
            }
            ans.add(list);
            return;
        }
        for(int i=index;i<nums.length;i++)
        {
            swap(i,index,nums);
            recursPermute(ans,nums,index+1);
             swap(i,index,nums);
        }

    }
    public void swap(int i,int j,int ans[])
    {
        int temp=ans[i];
        ans[i]=ans[j];
        ans[j]=temp;
    }
}
