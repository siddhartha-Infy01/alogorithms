package ai.noname.intel.list;

public class LinkedList {
    Node head;

    public Node add(int val) {
        if (head == null) {
            head = new Node();
            head.setVal(val);
        } else {
            Node current = head;
            while (current.hasNext()) {
                current = current.next;
            }

            Node next = new Node();
            next.setVal(val);
            current.setNext(next);
        }

        return head;
    }

    public void printList(Node head) {
        Node current = head;
        while (current.hasNext()) {
            System.out.println("Val::" + current.getVal());
            current = current.getNext();
        }
        System.out.println("Val::" + current.getVal());
    }

    public int length(Node head){
        Node current = head;
        int count=1;
        while (current.hasNext()) {
            current = current.getNext();
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5, 6, 7};
        LinkedList linkedList = new LinkedList();
        Node head = null;
        for (int i = 0; i <= values.length - 1; i++) {
            head = linkedList.add(values[i]);
        }
        System.out.println(head);
        linkedList.printList(head);
    }

}
