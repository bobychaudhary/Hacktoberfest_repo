package LinkedList.SinglyLinkedList;
public class RemoveDuplicate extends SinglyLinkedlist {

    //remove duplicates from sorted linked list
    public ListNode removeDuplicate(){
        ListNode current=head;
        while(current!=null && current.next!=null){
            if(current.data==current.next.data){
                current.next=current.next.next;
            }
            else{
                current=current.next;
            }
            return current;
        
        }
    }



    public static void main(String[] args) {
        
    }
    
}
