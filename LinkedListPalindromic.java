public class LinkedListPalindromic {
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

    public Node findMidNode(Node head)
    {
        Node hare = head;
        Node turtle = head;
        while(hare.next != null && hare.next.next != null)
        {
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }

    public Node reverse(Node head)
    {
        Node prev = head;
        Node curr = head.next;
        while(curr != null)
        {
            Node next = curr.next;
            curr.next = prev;
            //update
            prev = curr;
            curr = next;
        }
        head.next = null;
        head = prev;
        return head;
    }
    public boolean checkPalindromic(Node head)
    {
        if(head == null || head.next == null)
        {
            return true;
        }
        Node midNode = findMidNode(head);
        Node secondHalfStart = reverse(midNode.next);
        Node firstHalfStart = head;
        while(secondHalfStart != null)
        {
            if(firstHalfStart.data != secondHalfStart.data)
                return false;
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }
        return true;
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
        LinkedListPalindromic list  = new LinkedListPalindromic();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(30);
        list.insertLast(3);
        list.insertLast(2);
        list.insertLast(1);
        list.display();
        boolean result = list.checkPalindromic(list.head);
        System.out.println(result);
        // list.display();
    
        // list.display();
    }
}
