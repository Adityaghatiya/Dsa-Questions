class GFG
{
    //Function to store the zig zag order traversal of tree in a list.
	ArrayList<Integer> zigZagTraversal(Node root)
	{
	    //Add your code here.
	    int count=0;
	    Queue<Node>q=new LinkedList<>();
	    q.add(root);
	    ArrayList<Integer>list=new ArrayList<>();
	    
	    while(!q.isEmpty())
	    {  int height = q.size();

            for (int i = 0; i < height; i++) {
                Node curr = q.poll();
                list.add(curr.data);

                if (curr.left != null) {
                    q.offer(curr.left);
                }
                if (curr.right != null) {
                    q.offer(curr.right);
                }
            }

            if (count % 2 == 1) {
                // Reverse the list for odd levels
                Collections.reverse(list.subList(list.size() - height, list.size()));
            }
            count++;
	    }
	    return list;
	}
}
