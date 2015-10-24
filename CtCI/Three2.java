public class Three2{
    public static void main(String[]args){
        StackMin x = new StackMin();
        x.push(5);
        x.getMin();
        x.push(6);
        x.push(2);
        x.getMin();
        x.push(3);
        x.pop();
        x.pop();
        System.out.print(x.getMin());
    }
}

class StackMin{
    Node top;
    Node topMin;

    Object pop(){
        if (top!=null){
            int r= top.data;
            top=top.next;
            if (top.data == topMin.data){
                topMin = topMin.next;
            }
            return r;
        }
        return null;
    }
    void push(int n){
        if (top==null){
            top= new Node(n);
            topMin = new Node(n);
        }
        else{
            Node a=new Node(n);
            a.next=top;
            top=a;
            if(n<=topMin.data){
                a=new Node(n);
                a.next = topMin;
                topMin=a;
            }
        }
    }

    Object peek(){
        return top.data;
    }
    int getMin(){
        return topMin.data;
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
