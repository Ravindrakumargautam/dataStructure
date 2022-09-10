public class LinkedList_checkCycle {
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

    public boolean isCycleLinkedList(Node head)
    {
        if(head == null)
        {
            return false;
        }
        Node hare = head;
        Node turtle = head;
        while(hare.next != null && hare.next.next != null)
        {
            hare = hare.next.next;
            turtle = turtle.next;
            if(hare == turtle)
            {
                return true;
            }
            
        }
        return false;
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
        LinkedList_checkCycle list  = new  LinkedList_checkCycle();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(30);
        list.insertLast(3);
        list.insertLast(2);
        list.insertLast(1);
        list.display();
        boolean result = list.isCycleLinkedList(list.head);
        System.out.println(result);
        // list.display();
    
        // list.display();
    }
}
