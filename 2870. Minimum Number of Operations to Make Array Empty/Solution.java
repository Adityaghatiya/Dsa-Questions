class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
       
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int val = map.get(nums[i]);
                map.put(nums[i], val + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        int count = 0;

      
        
       
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int val = entry.getValue();

            if(val==1)
            {
                
                return -1;
            }
            else
            {
                 if (val % 3 == 0) {
                   
                count += val / 3;
            } 

            else if(val%3==1 || val%3==2)
            {
                
                count+=((val/3)+1);
            }
            else if (val % 2 == 0) {
               
                count += val / 2;
            } else {
                return -1; 
            }
            }
            
        }

        return count;
    }
}
