package DataStructures;
/**
 This program:
 - A simple program for traversal of a Singly Linked List.

 Some Notes:
 - Linked List is a linear data structure.
 - Unlike Arrays, linked list elements are not stored at contiguous location; the elements are linked used pointers.
 - The elements are linked using pointers.
 - Advantages / Dynamic size, Ease of insertion/deletion
 - Drawbacks / Random access is not allowed. We have to access elements sequentially starting from the first node.
    So we cannot do binary search with linked lists efficiently with its default implementation.
    Extra memory space for a pointer is required with each element of the list.
    Not cache friendly. Since array elements are contiguous locations, there is locality of reference which is not there
    in case of linked lists.

 Created at 2020-02
 */

class LinkedListTest {

    Node head; // head of list

    // method to create a simple linked list with 3 nodes
    public static void main(String[] args){

        // Start with the empty list.
        LinkedListTest llist = new LinkedListTest();

        llist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        llist.head.next = second; // Link first node with the second node
        second.next = third; // Link first node with the second node

        llist.printList();
    }

    // Linked list Node. This inner class is made static so that main() can access it
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        } // Constructor
    }

    // This function prints contents of linked list starting from head
    public void printList(){
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

}
