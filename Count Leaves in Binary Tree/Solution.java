Count Leaves in Binary Tree
class Tree
{
    int count=0;
    
    int countLeaves(Node node) 
    {
         // Your code  
        if(node!=null)
        {
            if(node.left==null && node.right==null)
            {
                count++;
            }
            else
            {
                if(node.left!=null)
                {
                    countLeaves(node.left);
                }
                if(node.right!=null)
                {
                    countLeaves(node.right);
                }
            }
        }
        return count;
    }
}
