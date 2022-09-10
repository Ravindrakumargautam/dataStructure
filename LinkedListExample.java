// Delete Nth Node From Last..

public class LinkedListExample {
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

    public Node findNthNodeFromLast(Node head, int n)
    {
        int size=0;
        Node currNode = head;
        while(currNode != null)
        {
            currNode = currNode.next;
            size++;
        }
        int nthPos = size-n+1;
        currNode = head;
        for(int i=1;i<nthPos;i++)
        {
            currNode = currNode.next;
        }
        return currNode;
    }

    public Node deleteNthNodeFromLast(Node head, int n)
    {
        if(head.next == null)
        {
            return null;
        }
        int size=0;
        Node currNode = head;
        while(currNode != null)
        {
            currNode = currNode.next;
            size++;
        }
        if(size == n){
            return head.next;
        }
        int nthPos = size-n;
        Node prev = head;
        int i=1;
        while(i<nthPos)
        {
            prev = prev.next;
        }
        prev.next = prev.next.next;
        return head;
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
        LinkedListExample list  = new LinkedListExample();
        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);
        list.insertLast(40);
        list.display();
        Node findNode = list.findNthNodeFromLast(list.head,3);
        System.out.println(findNode.data);
        list.head = list.deleteNthNodeFromLast(list.head, 3);
        list.display();
        // list.insertLast(50);
        // list.display();
        findNode = list.findNthNodeFromLast(list.head,3);
        System.out.println(findNode.data);
        list.head = list.deleteNthNodeFromLast(list.head, 3);
        list.display();
       
        //list.display();
    }
}
