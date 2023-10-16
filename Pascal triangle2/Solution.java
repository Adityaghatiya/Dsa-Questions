class Solution {
    public List<Integer> getRow(int r) {
        int res=1;
        List<Integer>list=new ArrayList<>();
        
        for(int i=0;i<=r;i++)
        {
            if(i==0)
            {
                list.add(1);
            }
            else
            {
             long val=(long)list.get(i-1)*(r-i+1)/i;
             list.add((int)val);
            }
            
        }
       return list;
    }
}
