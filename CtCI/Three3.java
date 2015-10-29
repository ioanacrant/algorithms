public class SetOfStacks{
    int threshold;
    ArrayList<Stack> set;

    public SetOfStacks(int t){
        threshold=t;
        set = new ArrayList<Stack>;
    }
    public Object pop(){
        Stack l = getLastStack();
        return l.pop();
    }
    public void push(Object a){
        Stack l = getLastStack();
        if (l.size()==threshold){
            Stack<Object> n = new Stack<Object>();
            n.push(a);
            set.add(n);
        }
        else{
            l.push(a);
        }
    }
    public Object popAt(){
        
    }
    public Stack getLastStack(){
        Stack l = set.get(set.size()-1);
        if (l.size==0){
            set.remove(set.size()-1);
        }
        return set.get(set.size()-1)
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
