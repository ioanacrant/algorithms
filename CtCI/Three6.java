import java.util.*;
public class Three6{
    public static void main(String[] args){
        Stack<Integer> a = new Stack<Integer>();
        a.push(2);
        a.push(5);
        a.push(1);
        a.push(3);
        a=sortStack(a);
        System.out.print(a.toString());
    }
    public static Stack<Integer> sortStack(Stack<Integer> n){
        Stack<Integer> holder=new Stack<Integer>();
        while (!n.isEmpty()){
            if (holder.isEmpty()||n.peek()>=holder.peek()){
                holder.push(n.pop());
            }
            else{
                int tr = n.pop();
                if (holder.isEmpty()){
                    holder.push(tr);
                }
                else{
                    while (!holder.isEmpty() && holder.peek()>tr){
                        n.push(holder.pop());
                    }
                    holder.push(tr);
                }

            }
        }
        return holder;
    }
}
