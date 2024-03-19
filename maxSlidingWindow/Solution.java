class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int len=nums.length;
        int i=0;
        int j=0;
        int arr[]=new int[len-k+1];

        Deque<Integer>que=new LinkedList<>();
        int s=0;
        int ans=0;

        while(j<len)
        {
            if(que.size()>0)
            {
                while(que.size()>0 && que.getLast()<nums[j])
                {
                    que.removeLast();
                }
                que.addLast(nums[j]);
            }
            else {
                que.addFirst(nums[j]);
            }
            
            if(j-i+1<k)
            {
              j++;
            }
            else if(j-i+1==k)
            {
                arr[s]=que.getFirst();
                s++;

                if(nums[i]==que.getFirst())
                {
                    que.removeFirst();
                }
                i++;
                j++;
            }
        }
        return arr;
    }
}
