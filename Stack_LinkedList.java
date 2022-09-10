public class Stack_LinkedList {
    // Stack top;
    static class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            next = null;
        }
    }
    public static class Stack{

        static Node top;
        public static boolean isEmpty()
        {
            return top==null;
        }
        
        public static void push(int data)
        {
            Node newNode = new Node(data);
            if(isEmpty())
            {
                top = newNode;
                return;
            }
            newNode.next = top;
            top = newNode;
        }

        public static int pop()
        {
            if(isEmpty())
            {
                return -1;
            }
            int data = top.data;
            top = top.next;
            return data;
        }

        public static int peek()
        {
            if(isEmpty())
            {
                return -1;
            }
            // Node temp = top;
            return top.data;
        }
        
    }

    
    public static void main(String args[])
    {
        
        Stack.push(10);
        Stack.push(20);
        Stack.push(30);
        Stack.push(40);
        Stack.push(50);
        // Stack.pop();
        while(!Stack.isEmpty())
        {
            System.out.println(Stack.peek());
            Stack.pop();
        }
    }
}
