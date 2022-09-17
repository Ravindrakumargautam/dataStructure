public class Queue_LinkedList {

    static Node head, tail;
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public static boolean isEmpty()
    {
        return head == null & tail == null;
    }
    // enQueue O(1)
    public void add(int data)
    {
        Node newNode = new Node(data);
        if(tail == null)
        {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = tail.next;
    }

    // remove O(1)
    public void remove()
    {
        if(isEmpty())
        {
            System.out.println("queue is empty");
            return;
        }
        if(head == tail)
        {
            tail = null;
        }
        head = head.next;
    }

    // peek - O(1)
    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("queue is empty");
            return -1;
        }
        return head.data;
    }
    public static void main(String args[])
    {
        Queue_LinkedList q = new Queue_LinkedList();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        // System.out.println(q.peek());
        q.remove();
        q.remove();
        q.remove();
        while(!isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
