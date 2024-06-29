
/*
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}*/

class Solution {
    // Function to check whether two linked lists are identical or not.
    public boolean areIdentical(Node head1, Node head2) {
        // write your code here
        
        if(head1==null || head2==null)
        {
            return false;
        }
        Node temp=head1;
        int cnt=0;
        while(temp!=null)
        {
            cnt++;
            temp=temp.next;
        }
        Node temp2=head2;
        int cnt2=0;
        while(temp2!=null)
        {
            cnt2++;
            temp2=temp2.next;
        }
        if(cnt!=cnt2)
        {
            return false;
        }
        temp=head1;
        temp2=head2;
        while(temp!=null && temp2!=null)
        {
            if(temp.data!=temp2.data)
            {
                return false;
            }
            temp=temp.next;
            temp2=temp2.next;
        }
        
        return true;    }
}
