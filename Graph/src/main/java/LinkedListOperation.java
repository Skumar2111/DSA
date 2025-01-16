public class LinkedListOperation {

    Node head;

    static class Node
    {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static void main(String[] args) {

        LinkedListOperation linkedListOperation = new LinkedListOperation();

        Node newNode = new Node(5);
        linkedListOperation.head = newNode;
        insertToListStart(10,newNode);

    }

    private static void insertToListStart(int i, Node head) {
        Node n = new Node(10);
        n.next = head;
        head = n;
    }

}
