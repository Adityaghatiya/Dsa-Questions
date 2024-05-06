class Tree
{
    ArrayList<Integer> noSibling(Node node)
    {
        ArrayList<Integer> list = new ArrayList<>();
        sibbling(node, list);
        if (list.size() == 0)
        {
            list.add(-1);
        }
        Collections.sort(list);
        return list;
    }

    void sibbling(Node node, ArrayList<Integer> ans)
    {
        if (node == null)
        {
            return;
        }

        if (node.left != null && node.right == null)
        {
            ans.add(node.left.data);
        }
        if (node.right != null && node.left == null)
        {
            ans.add(node.right.data);
        }

        sibbling(node.left, ans);
        sibbling(node.right, ans);
    }
}
