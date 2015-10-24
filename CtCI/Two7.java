import java.util.*;
public class Two7{
    public static boolean checkPalindrome(Node head){
        Node keepOhead = head;
        Node newhead = head;
        while (head.next!=null){
            head=head.next;
            Node temphead = new Node(head.data);
            temphead.next = newhead;
            newhead=temphead;
        }
        while (keepOhead!=null){
            if (keepOhead.data!=newhead.data){
                return false;
            }
            keepOhead=keepOhead.next;
            newhead=newhead.next;
        }
        return true;
    }

    public static boolean checkPalindromebetter(Node head){
        Stack<Integer> fhalf = new Stack<Integer>();
        Node slow = head;
        Node fast = head;
        while (true){
            if (fast==null){

                return checkSame(fhalf,slow);
            }
            if (fast.next==null){
                return checkSame(fhalf, slow.next);
            }
            fhalf.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }
    }
    public static boolean checkSame(Stack<Integer> a, Node b){
        while (b!=null){
            if (b.data!=a.pop()){
                return false;
            }
            b=b.next;
        }
        return true;
    }

    public static void main(String[] args){
        Node a = new Node(1);
        a.appendToTail(2);
        a.appendToTail(1);
        a.appendToTail(1);


        System.out.print(checkPalindromebetter(a));


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
