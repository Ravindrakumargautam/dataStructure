import java.util.*;
public class Queue_usingTwoStack {
    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();
        public static boolean isEmpties()
        {
            return s1.isEmpty() && s2.isEmpty();
        }

        // add - O(n)
        public void add(int data)
        {
            while(!s1.isEmpty())
            {
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty())
            {
                s1.push(s2.pop());
            }
        }

        // remove- O(1) 
        public void remove()
        {
            if(isEmpties())
            {
                return;
            }
            s1.pop();
        }

        // peek - O(1)
        public int peek()
        {
            if(isEmpties())
            {
                return -1;
            }
            return s1.peek();
        }

    }

    public static void main(String args[])
    {
        Queue q1 = new Queue();
        q1.add(10);
        q1.add(20);
        q1.add(30);
        q1.add(40);
        while(!Queue.isEmpties())
        {
            System.out.println(q1.peek());
            q1.remove();
        }
    }
}
