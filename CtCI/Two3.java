public class Two3{
    public static void deleteNode(Node n){
        if (n.next!=null){
            int nextnum = n.next.data;
            n.data=nextnum;
            n.next = n.next.next;
        }


    }

    public static void main(String[] args){
        Node a = new Node(2);
        a.appendToTail(1);


        deleteNode(a.next);
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
