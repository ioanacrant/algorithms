public class Two2{
    public static Node kthLast(Node head, int k){
        Node p1 = head;
        Node p2 = head;

        for (int i=0;i<k;i++){
            p2=p2.next;
            if (p2==null){
                return null;
            }
        }
        while (p2!=null){
            p1=p1.next;
            p2=p2.next;
        }
        return p1;
    }
    public static void main(String[] args){
        Node a = new Node(2);
        a.appendToTail(5);
        a.appendToTail(1);
        a.appendToTail(3);

        System.out.print(kthLast(a,2).data);

    }
}

class Node{
    Node next=null;
    int data;
    public Node(int d){
        data=d;
    }
    void appendToTail(int d){
        Node end = new Node(d);
        Node n = this;
        while (n.next != null){
            n = n.next;
        }
        n.next = end;
    }
}
