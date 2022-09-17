public class QueueArray {
    static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;
        Queue(int n)
        {
            size = n;
            arr = new int[n];
        }

        public static boolean isEmpty()
        {
            return rear == -1;
        }
        // enqueue - O(1)
        public void add(int data)
        {
            if(rear == size-1)
            {
                System.out.println("full queue");
                return;
            }
            
            rear++;
            arr[rear] = data;
            // System.out.println(arr[rear]);
        }

        // dequeue-O(n)
        public int remove()
        {
            if(isEmpty())
            {
                System.out.println("empty queue");
                return -1;
            }
            int front = arr[0];
            for(int i = 0;i<rear;i++)
            {
                arr[i]= arr[i+1];
            }
            // System.out.println(temp);
            rear--;
            return front;

        }

        // peek-O(n)
        public int peek()
        {
            if(isEmpty())
            {
                System.out.println("empty array");
                return -1;
            }
            return arr[0];
        }
    }

    

    public static void main(String args[])
    {
        Queue q = new Queue(5);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.remove();
        q.remove();
        // q.remove();q.remove();
        // q.remove();
        q.remove();
        // q.remove();
        // q.remove();
        while(!Queue.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
