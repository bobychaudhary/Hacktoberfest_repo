package LinkedList.SinglyLinkedList;

public class SinglyLinkedlist{
    public ListNode head;
    static class ListNode{
        public int data;
        public ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=next;
        }
    }

    //to count the elements of SinglyLinkedList
    public int count(){
        if(head==null){
            return 0;
        }
        int count=0;
        ListNode current=head;
        while(current!=null){
            count++;
            current =current.next;
        }
        return count;

    }

    // to insert element in the beginning
    public void insertFirst(int value){
        ListNode newNode=new ListNode(value);
        newNode.next=head;
        head=newNode;
    }

    // to insert element in the last
    public void insertLast(int value){
        ListNode newNode=new ListNode(value);
        if(head==null){
            head=newNode; return;
        }
        ListNode current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
    }

    //to display the elements of SinglyLinkedList
    public void display(){
        ListNode current=head;
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SinglyLinkedlist obj=new SinglyLinkedlist();
        
    }
}