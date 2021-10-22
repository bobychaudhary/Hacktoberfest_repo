/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 24-Jun-21
 *   Time: 12:30 PM
 *   File: Main.java
 */

package March.mar03_21_NK;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList ll = new CircularLinkedList();
        ll.insertAtEnd(new Node(5));
        ll.insertAtEnd(new Node(10));
        ll.insertAtEnd(new Node(12));
        ll.insertAtEnd(new Node(11));
        ll.print();
        ll.deleteAtBegin();
        ll.print();
    }
}

