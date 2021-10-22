/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 24-Jun-21
 *   Time: 12:14 PM
 *   File: CircularLinkedList.java
 */

package March.mar03_21_NK;

public class CircularLinkedList {
    public Node head;
    public Node tail;

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertAtEnd(Node newNode) {
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = tail.next;
            tail.next = head;
        }
    }

    public void insertAtBegin(Node newNode) {
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
            tail.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void deleteAtEnd() {
        if (isEmpty()) {
            System.out.println("Linked list Empty");
        } else if (head.next == head) {
            head = null;
            tail = null;
        } else {
            Node temp = head;
            while (temp.next.next != head) {
                temp = temp.next;
            }
            temp.next = head;
            tail = temp;
        }
    }

    public void deleteAtBegin() {
        if (isEmpty()) {
            System.out.println("Empty");
        } else if (head.next == head) {
            head = tail = null;
        } else {
            head = head.next;
            tail.next = head;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Empty");
        } else {
            Node temp = head;
            do {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            } while (temp != head);
            System.out.println();
        }
    }
}

