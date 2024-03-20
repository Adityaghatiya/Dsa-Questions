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
//Level Order Traversal 
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
       
        List<Integer>list=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
         if(root==null)
        {
            return list;
        }
        q.offer(root);
        while(!q.isEmpty())
        {
            int height=q.size();
           

            for(int i=0;i<height;i++)
            {  
              
                TreeNode curr=q.poll();
                if(i==height-1)
                {
                    list.add(curr.val);
                }
                if(curr.left!=null)
                {
                    q.add(curr.left);
                }
                if((curr.right!=null))
                {
                    q.add(curr.right);
                }

            }
        }
        return list;
    }
}
