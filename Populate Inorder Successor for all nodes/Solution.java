class Solution {
       private Node prev=null;
    public void populateNext(Node root) {
        // code here
    
        
        solve(root);
    }
    public void solve(Node root)
    {
        if(root==null)
        {
            return;
        }
        
        solve(root.left);
        
        if(prev!=null)
        {
            prev.next=root;
        }
        
        prev=root;
        
        solve(root.right);
    }
}
