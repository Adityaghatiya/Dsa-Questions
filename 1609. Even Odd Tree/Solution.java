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
    public boolean isEvenOddTree(TreeNode root) {
         if(root == null) return true;
         
         Queue<TreeNode> queue = new LinkedList<>();
         queue.offer(root);
         
         boolean evenLevel = true;
         
         while(!queue.isEmpty()) {
             int size = queue.size();
             int prev = evenLevel ? Integer.MIN_VALUE : Integer.MAX_VALUE;
             
             while(size-- > 0) {
                 TreeNode curr = queue.poll();
                 
                 if(evenLevel) {
                     if(curr.val % 2 == 0 || curr.val <= prev)
                         return false;
                 } else {
                     if(curr.val % 2 != 0 || curr.val >= prev)
                         return false;
                 }
                 
                 prev = curr.val;
                 
                 if(curr.left != null)
                     queue.offer(curr.left);
                 if(curr.right != null)
                     queue.offer(curr.right);
             }
             
             evenLevel = !evenLevel;
         }
         return true;
    }
}
