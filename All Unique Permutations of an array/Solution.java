
class Solution {
    static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr , int n) {
        // code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if(arr.size() == 0) return res;
        boolean[] vis = new boolean[arr.size()];
        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.sort(arr);
        backtrack(list,res,vis,arr);
        return res;
    }
    static void backtrack(ArrayList<Integer> list, ArrayList<ArrayList<Integer>> res, boolean[] vis, ArrayList<Integer> arr) {
        int n = arr.size();
        if(list.size() == n) {
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<n;++i) {
            if(vis[i]) continue;
            if(i > 0 && vis[i-1] == false && (arr.get(i-1) == arr.get(i))) continue;
            vis[i] = true;
            list.add(arr.get(i));
            backtrack(list,res,vis,arr);
            vis[i] = false;
            list.remove(list.size()-1);
            
        }
    }

};
