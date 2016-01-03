public class Three5{
    public static void main(String[] args){
        MyQueue n = new MyQueue();
        n.push(1);
        n.push(2);
        n.pop();
        n.push(3);
    }

}

class MyQueue{
    Stack in, out;
    MyQueue(){
        in = new Stack();
        out=new Stack();
    }
    void push(Object item){
        in.push(item);
    }
    Object pop(){
        if (out.top!=null){
            return out.pop();
        }
        while (in.top!=null){
            out.push(in.pop());
        }
        return out.pop();
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
    Object data;
    public Node(Object d){
        data=d;
    }
}
