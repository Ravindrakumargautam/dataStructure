import java.util.*;
public class Stack_ArrayList {
    static class Stack{

        public static boolean isEmpty()
        {
            return list.size()==0;
        }
        public static ArrayList<Integer> list = new ArrayList<>();
        public static void push(int data)
        {
            list.add(data);
        }
        public static void pop()
        {
            if(isEmpty())
            {
                return;
            }
            list.remove(list.size()-1);
        }
        public static int peek()
        {
            if(isEmpty())
            {
                return -1;
            }
           int top =  list.get(list.size()-1);
            return top;
        }
    }
    public static void main(String args[])
    {
        
        Stack.push(12);
        Stack.push(23);
        Stack.push(20);
        Stack.pop();
        while(! Stack.isEmpty())
        {
            System.out.println( Stack.peek());
            Stack.pop();
        }
    }
}
