public class LinkedList {

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

        LinkedList lList = new LinkedList();

        lList.head = new Node(10);
        Node second = new Node(20);
        Node thirdNode = new Node(30);

        lList.head.next = second;
        second.next = thirdNode;
        thirdNode.next = null;

        Node n = lList.head;

        while (n != null)
        {
            System.out.println(n.data);
            n = n.next;
        }




    }

}

