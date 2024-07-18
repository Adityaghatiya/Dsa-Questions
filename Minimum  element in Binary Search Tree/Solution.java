
/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/
class Solution {
    // Function to find the minimum element in the given BST.
    int max=Integer.MAX_VALUE;
    int minValue(Node node) {
        solve(node);
        return max;
    }
    void solve(Node node)
    {
        if(node==null)
        {
            return ;
        }
        max=Math.min(max,node.data);
        
        solve(node.left);
        solve(node.right);
        
       
    }
}
