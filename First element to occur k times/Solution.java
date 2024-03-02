class Solution
{
    public int firstElementKTime(int n, int k, int[] a) { 
       HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0; i < n; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
            if(map.get(a[i]) == k) {
                return a[i];
            }
        }
        
        
        return -1;
    } 
}
