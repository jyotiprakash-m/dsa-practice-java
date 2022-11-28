package linked_list_apna;

public class LinkedList {
    public static int size = 0;

    public static class Node {
        int data;
        Node next;

        public Node(int data) {

            this.data = data;
            this.next = null;
        }
    }

//    Declare head and tail
    public static Node head;
    public static Node tail;

    // Add first O(n)
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // Add last O(n)
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Print linked list
    public void print() {
        if (head == null) {
            System.out.println("Linkedlist is empty");
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            System.out.print(temp.data + "--> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    // insert in particular position
    public void add(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while (i == index - 1) {
            temp = temp.next;
            i++;
        }
        size++;
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove first
    public int removeFirst() {
        int value = head.data;
        head = head.next;
        return value;
    }
//    public int removeLast() {
//        
//    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(1);
        ll.add(0, 9);
        ll.print();
//        ll.addFirst(2);
//        ll.print();
//        ll.addLast(5);
//        ll.print();
//        ll.addLast(7);
//        ll.print();
        System.out.println(ll.size);

    }
}
