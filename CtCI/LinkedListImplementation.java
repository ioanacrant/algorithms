class Node{
    int value;
    Node next;
    public Node(int v){
        value=v;
        next=null;
    }

    void appendToTail(int n){
        Node n = next;
        while (n!=null){
            n=n.next;
        }
        n = new Node(n);
    }
    Node deleteNode(int n, Node head){
        if (head.value==n){
            return head.next;
        }
        Node a = head;
        while (a.next!=null){
            if (a.next.value==n){
                a.next=a.next.next;
                return head;
            }
            a=a.next;

        }
    }
}
