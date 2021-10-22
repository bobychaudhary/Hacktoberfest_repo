package LinkedList.SinglyLinkedList;

public class InsertInSorted extends SinglyLinkedlist {
    
    // insert a node in a sorted linkedList 
    public ListNode insertInSortedLinkedList(int data){
        ListNode newNode=new ListNode(data);
        ListNode current=head;
        ListNode temp=null;
        while(current!=null && current.data<newNode.data){
            temp=current;
            current=current.next;
        }
        newNode.next=current;
        temp.next=newNode;
        return head;
    }

    public static void main(String[] args) {
        
    }
    
}
