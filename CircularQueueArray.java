public class CircularQueueArray {
    static class Queue{
        static int rear = -1;
        static int front = -1;
        static int size;
        static int arr[];
        Queue(int n)
        {
            size = n;
            arr = new int[n];
        }

        public static boolean isEmpty()
        {
            return (front ==-1 && rear == -1);
        }

        
        public static boolean isFull()
        {
            return (rear+1)%size == front;
        }

        // enqueue o(1)
        public void add(int data)
        {
            if(isFull())
            {
                System.out.println("queue is full");
                return;
            }
            if(front == -1)
            {
                front++;
            }
            rear = (rear+1)%size;
            arr[rear]=data;
            // System.out.println(arr[rear]);
        }

        // dequeue
        public void remove()
        {
            if(isEmpty())
            {
                System.out.println("queue is empty");
                return;
            }
            if(front == rear)
            {
                front = rear = -1;
                return;
            }
            front = (front+1)%size;
            return;
        }

        // peak - O(1)
        public int peek()
        {
            if(isEmpty())
            {
                System.out.println("queue is empty");
                return -1;
            }
            return arr[front];
        }

    }
    public static void main(String args[])    {
        Queue q = new Queue(5);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        // q.remove();
        q.remove();
        q.add(60);
        q.remove();
        q.add(70);
        // q.remove();
        while(!Queue.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
