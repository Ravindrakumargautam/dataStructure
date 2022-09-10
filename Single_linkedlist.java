class Single_linkedlist
{
    private int size;
    Single_linkedlist(){
        this.size = 0;
    }

    Node head;
    class Node
    {
        String data;
        Node next;
        Node(String data)
        {
            this.data = data;
            next = null;
            size++;
        }
    }

    public void insertFirst(String data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void insertEnd(String data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }
        else
        {
            Node currNode = head;
            while(currNode.next != null)
            {
                currNode = currNode.next;
            }
            currNode.next = newNode;
        }

    }

    public void deleteFirst()
    {
        if(head == null)
        {
            System.out.println("list is empty");
            return;
        }
        size--;
        head = head.next;
    }
    
    public void deleteLast()
    {
        if(head == null)
        {
            System.out.println("list is empty");
            return;
        }

        size--;

        if(head.next == null)
        {
            head =null;
            return;
        }
        Node secNode = head;
        Node lastNode = head.next;
        while(lastNode.next != null)
        {
            lastNode = lastNode.next;
            secNode = secNode.next;
        }
        secNode.next = null;
        
    }

    public int getSize()
    {
        return size;
    }
    public void display()
    {
        if(head == null)
        {
            System.out.println("list is empty");
        }
        else
        {
            Node currNode = head;
            while(currNode != null)
            {
                System.out.print(currNode.data+"->");
                currNode = currNode.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String args[])
    {
        Single_linkedlist list = new Single_linkedlist();
        list.insertEnd("ravi");
        list.insertEnd("kuamr");
        list.insertEnd("gautam");
        list.display();
        list.insertFirst("Mr.");
        list.insertFirst("Mis./");
        list.display();
        list.deleteFirst();
        list.display();
        list.insertFirst("Mis./");
        list.display();
        list.deleteLast();
        list.display();
        System.out.println(list.getSize());
    }
}
