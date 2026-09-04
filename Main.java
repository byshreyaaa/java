// Node class representing each element in the linked list
class Node {
    private int data;
    private Node next;

    // Constructor
    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    // Getters and Setters
    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

// LinkedList class implementing the list operations
class LinkedList {
    private Node head;
    private Node tail;
    private int count;

    // Insert element at the beginning of the list
    public void insertFirst(int data) {
        this.head = new Node(data, this.head);
        this.count++;
        if (this.count == 1) {
            this.tail = this.head;
        }
    }

    // Insert element at the end of the list
    public void insertLast(int data) {
        Node temp = new Node(data, null);
        if (this.count == 0) {
            this.head = temp;
            this.tail = temp;
        } else {
            this.tail.setNext(temp);
            this.tail = temp;
        }
        this.count++;
    }

    // Delete the first element of the list
    public Node deleteFirst() {
        if (this.count == 0) {
            return null;
        } else {
            Node temp = this.head;
            this.head = this.head.getNext();
            temp.setNext(null);
            this.count--;
            if (this.count == 0) {
                this.tail = null;
            }
            return temp;
        }
    }

    // Delete the last element of the list
    public Node deleteLast() {
        if (this.count == 0) {
            return null;
        }

        Node deleted = this.tail;

        if (this.count == 1) {
            this.head = null;
            this.tail = null;
        } else {
            Node temp = this.head;
            // Traverse to the second-to-last node
            while (temp.getNext() != this.tail) {
                temp = temp.getNext();
            }
            this.tail = temp;
            this.tail.setNext(null);
        }

        this.count--;
        return deleted;
    }

    // Print the linked list structure
    public void printList() {
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.getData() + " -> ");
            temp = temp.getNext();
        }
        System.out.println("NULL");
    }
}

// Main class to run and test the LinkedList implementation
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Testing insertions
        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);
        list.insertLast(40);

        System.out.print("Initial Linked List: ");
        list.printList();

        // Testing deleteLast
        Node deletedLast = list.deleteLast();
        System.out.println("Deleted last node data: " + (deletedLast != null ? deletedLast.getData() : "None"));

        System.out.print("Linked List after deleteLast: ");
        list.printList();
    }
}
