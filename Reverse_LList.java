
public class Reverse_LList {

    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            next = null;
        }
    }

    public void insertLast(int item)
    {
        Node newNode = new Node(item);
        if(head == null)
        {
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null)
        {
            currNode = currNode.next;
        }
        currNode.next = newNode;

    }

    public void reverseIterative()
    {
        if(head == null || head.next == null)
        {
            return;
        }
        Node preNode = head;
        Node curNode = head.next;
        while(curNode != null)
        {
            Node nextNode = curNode.next;
            curNode.next = preNode;
            //update
            preNode = curNode;
            curNode = nextNode;
        }
        head.next = null;
        head = preNode;

    }

    public Node reverseRecursive(Node head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    public void display()
    {
        if(head == null)
        {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null)
        {
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
        }
        System.out.println("null");

    }
    public static void main(String args[])
    {
        Reverse_LList list  = new Reverse_LList();
        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);
        list.display();
        list.reverseIterative();
        list.display();
        list.head = list.reverseRecursive(list.head);
        list.display();
    }
}
