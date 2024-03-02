class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer>output=new ArrayList<>();

        List<List<Integer>>ans=new ArrayList<>();
         boolean freq[]=new boolean[nums.length];

         recursivePermutation(nums,output,ans,freq);
         return ans;
    }
    private void recursivePermutation(int nums[],List<Integer>output,List<List<Integer>>ans,boolean freq[])
    {
        if(output.size()==nums.length)
        {
            ans.add(new ArrayList<>(output));
            return;
        }

        for(int i=0;i<nums.length;i++)
        {
            if(!freq[i])
            {
                freq[i]=true;
                output.add(nums[i]);

                recursivePermutation(nums,output,ans,freq);
                output.remove(output.size()-1);
                freq[i]=false;
            }
        }
    }
}
