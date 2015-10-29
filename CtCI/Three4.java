import java.util.*;
public class Three4{
    public static void moveRight(Stack s1, Stack s2, Stack s3, int n){
        if (n==1){
            s2.push(s1.pop());
            s3.push(s2.pop());
        }
        else{
            moveRight(s1,s2,s3,n-1);
            s2.push(s1.pop());
            moveLeft(s1,s2,s3,n-1);
            s3.push(s2.pop());
            moveRight(s1,s2,s3,n-1);
        }
    }
    public static void moveLeft(Stack s1, Stack s2, Stack s3, int n){
        if (n==1){
            s2.push(s3.pop());
            s1.push(s2.pop());
        }
        else{
            moveLeft(s1,s2,s3,n-1);
            s2.push(s3.pop());
            moveRight(s1,s2,s3,n-1);
            s1.push(s2.pop());
            moveLeft(s1,s2,s3,n-1);
        }
    }
    public static void main(String[]args){
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        Stack<Integer> s3 = new Stack<Integer>();
        s1.push(4);
        s1.push(3);
        s1.push(2);
        s1.push(1);
        moveRight(s1,s2,s3,4);
        System.out.print(s3.toString());
        System.out.print(s3.pop());
        System.out.print(s3.pop());
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
