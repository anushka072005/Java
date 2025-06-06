import java.util.LinkedList;

public class LinkedListDoubly {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size; 

    // addfirst in DLL
    public void addfirst(int data)  {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // addLast DLL
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Remove first DLL
    public int removeFirst() {
        if(head == null) {
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    // Remove Last DLL
    public int removeLast() {
        if(head == null) {
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }

        if (size == 1) { 
            int val = tail.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }

    // reverse DLL
    public void reverse() {
        Node curr = head;
        Node prev = null;
        Node next;
    
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
    
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // print DLL
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        LinkedListDoubly dLL = new LinkedListDoubly();

        dLL.addfirst(3);
        dLL.addfirst(2);
        dLL.addfirst(1);

        dLL.addLast(4);
        dLL.addLast(5);

        // dLL.removeFirst();
        // dLL.removeFirst();

        // dLL.removeLast();

        dLL.reverse();
        
        dLL.print();
        System.out.println("size of DLL : " + dLL.size);
    }
}
