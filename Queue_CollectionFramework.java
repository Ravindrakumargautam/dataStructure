import java.util.*;
public class Queue_CollectionFramework {
    public static void main(String args[])
    {
        // Queue<Integer> q = new ArrayDeque<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.remove();
        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
