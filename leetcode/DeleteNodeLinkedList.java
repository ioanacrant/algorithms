public class DeleteNodeLinkedList{
    public static void deleteNode(ListNode node){
        while(node.next.next!=null){
            node.val = node.next.val;
            node = node.next;

        }
        node.val = node.next.val;
        node.next=null;
    }
    public static void main(String[]args){node

    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
