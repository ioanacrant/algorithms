public class Three1{



    public static void main(String[] args){

    }
}
class Stack{
    Node top;
    Object pop(){
        if (top!=null){
            Object item = top.data;
            top = top.next;
            return item;
        }
        return null;
    }
    void push(Object item){
        Node t = new Node(item);
        t.next = top;
        top=t;
    }
    Object peek(){
        return top.data;
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
