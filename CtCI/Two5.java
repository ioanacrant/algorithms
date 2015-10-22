public class Two5{
    public static Node addLinkedLists(Node l1, Node l2){
        Node newl=new Node(0);
        Node head = newl;
        int digsum;
        int carry=0;

        while (l1!=null || l2!=null){
            if (l1==null){
                l1=new Node(0);

            }
            if (l2==null){
                l2=new Node(0);

            }

            digsum = (l1.data+l2.data)%10;
            newl.data = digsum+carry;
            carry =  (l1.data+l2.data)/10;
            if (l1.next==null && l2.next==null){
                break;
            }
            newl.next = new Node(0);
            newl=newl.next;
            l1=l1.next;
            l2=l2.next;
        }
        if (carry!=0){
            newl.data=carry;
        }
        return head;
    }

    public static Node addLinkedListsForwards(Node l1, Node l2){
        Node newl = new Node(0);
        Node head = newl;
        Node l1head = l1;
        Node l2head = l2;
        while (l1!=null || l2!=null){
            if (l1==null){
                Node a= new Node(0);
                a.next=l1head;
                l1head=a;
                l1 = new Node(0);
            }
            if (l2==null){
                Node a= new Node(0);
                a.next=l2head;
                l2head=a;
                l2 = new Node(0);
            }
            l1=l1.next;
            l2=l2.next;
        }
        Node nhead = addForwards(l1head,l2head,newl, head);
        if (nhead.data==0){
            return nhead.next;
        }
        return nhead;
    }

    public static Node addForwards(Node l1, Node l2,Node newl, Node head){
        if (l1==null && l2==null){
            return head;
        }
        int digsum=(l1.data+l2.data)%10;
        int carry=(l1.data+l2.data)/10;
        newl.data+=carry;
        newl.next=new Node(digsum);
        newl=newl.next;

        l1=l1.next;
        l2=l2.next;
        return addForwards(l1,l2,newl,head);
    }

    public static void main(String[] args){
        Node a = new Node(1);
        a.appendToTail(1);
        Node b = new Node(6);
        b.appendToTail(6);


        Node h=addLinkedListsForwards(a,b);
        while(h!=null){
            System.out.print(h.data);
            h=h.next;
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
