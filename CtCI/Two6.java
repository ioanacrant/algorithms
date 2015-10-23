public class Two6{
    public static Node findLoop(Node head){
        Node fast = head;
        Node slow = head;
        while (true){
            slow = slow.next;
            fast=fast.next.next;
            if (slow==fast){
                break;
            }
        }
        while(true){
            if (head==slow){
                return head;
            }
            slow=slow.next;
            head=head.next;

        }
    }

    public static void main(String[] args){
        Node a = new Node(1);
        a.appendToTail(2);
        a.appendToTail(3);
        Node b = new Node(4);
        b.appendToTail(5);
        a.next.next.next=b;
        b.next.next=b;

        Node c= findLoop(a);
        System.out.print(c.data);


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
