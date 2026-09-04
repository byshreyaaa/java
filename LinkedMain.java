
public class LinkedMain {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        
        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);
        list.insertLast(40);

        System.out.print("Initial Linked List: ");
        list.printList();

        Node deletedLast = list.deleteLast();
        System.out.println("Deleted last node data: " + (deletedLast != null ? deletedLast.getData() : "None"));

        System.out.print("Linked List after deleteLast: ");
        list.printList();
    }
}

