class Solution {
    public int[] intersect(int[] arr, int[] arr2) {
        List <Integer> l1=new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++)
        {
            l1.add(arr[i]);
        }
        List <Integer>l2=new ArrayList<Integer>();
        for(int j=0;j<arr2.length;j++)
        {
            if(l1.contains(arr2[j]))
            {
                l2.add(arr2[j]);
                l1.remove(Integer.valueOf(arr2[j]));
            }
        }
        int ar[]=new int[l2.size()];
        int i=0;
        for(int num:l2)
        {
            ar[i++]=num;
            
        }
        
        return ar;
    }
}
