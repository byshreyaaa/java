class Node {
    private int data;
    private Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

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

class LinkedList {
    private Node head;
    private Node tail;
    private int count;

    public void insertFirst(int data) {
        this.head = new Node(data, this.head);
        this.count++;
        if (this.count == 1) {
            this.tail = this.head;
        }
    }

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
            while (temp.getNext() != this.tail) {
                temp = temp.getNext();
            }
            this.tail = temp;
            this.tail.setNext(null);
        }

        this.count--;
        return deleted;
    }

    public void printList() {
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.getData() + " -> ");
            temp = temp.getNext();
        }
        System.out.println("NULL");
    }
}
