public class Two1{
    public static void removeDuplicates(Node n){
        while (n!=null){
            Node run = n;
            while (run.next!=null){
                //System.out.print(n.next.data);
                if (run.next.data == n.data){
                    run.next = run.next.next;

                }
                else{
                    run=run.next;
                }

            }
            n=n.next;
        }

    }
    public static void removeRest(Node n, int num){
        //System.out.println(n.data);
        //System.out.println(num);
        while (n.next!=null){
            //System.out.print(n.next.data);
            if (n.next.data == num){
                n.next = n.next.next;

            }
            else{
                n=n.next;
            }

        }
        System.out.print(n.data);

    }
    public static void main(String[] args){
        Node a = new Node(2);
        a.appendToTail(1);
        a.appendToTail(1);
        a.appendToTail(1);

        removeDuplicates(a);
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
