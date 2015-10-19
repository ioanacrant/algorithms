public class Two4{
    public static Node partition(Node head, int x){
        Node prev=head;
        Node run= head.next;
        while (run!=null){
            if (run.data>=x){
                run=run.next;
                prev=prev.next;
            }
            else{
                prev.next=prev.next.next;
                run.next=head;
                head=run;
                //System.out.print(head.data);
                run=prev.next;

            }
        }
        return head;
    }

    public static void main(String[] args){
        Node a = new Node(3);
        a.appendToTail(1);
        a.appendToTail(4);
        a.appendToTail(0);

        a= partition(a,2);
        while(a!=null){
            System.out.print(a.data);
            a=a.next;
        }
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
