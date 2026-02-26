class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DetectLoop {

    // Function to detect loop
    public static boolean hasLoop(Node head) {

        Node slow = head;
        Node fast = head;

        // check before moving fast by 2 steps
        while (fast != null && fast.next != null) {

            slow = slow.next;        // move 1 step
            fast = fast.next.next;   // move 2 steps

            if (slow == fast) {
                return true; // loop found
            }
        }

        return false; // no loop
    }

    public static void main(String[] args) {

        // Creating linked list
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Creating a loop (5 → 3)
        head.next.next.next.next.next = head.next.next;

        // Check loop
        if (hasLoop(head)) {
            System.out.println("Loop Detected");
        } else {
            System.out.println("No Loop");
        }
    }
}