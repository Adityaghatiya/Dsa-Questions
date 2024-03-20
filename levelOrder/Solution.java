/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>list=new ArrayList<>();
        if(root==null)
        {
            return list;
        }
        Queue<TreeNode>q=new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty()){
            
            int height=q.size();
             List<Integer>l1=new ArrayList<>();
            for(int i=0;i<height;i++)
            {
                TreeNode curr=q.poll();

                l1.add(curr.val);

                if(curr.left!=null)
                {
                    q.add(curr.left);
                }
                if(curr.right!=null)
                {
                    q.add(curr.right);
                }
            }
            list.add(l1);
        }
        return list;
    }
}
