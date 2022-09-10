import java.util.*;
public class Stack_Ex_PushBottom {

    public static void pushBottom(int data, Stack<Integer> s)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushBottom(data,s);
        s.push(top);
    }

    public static void main(String args[])
    {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(30);
        s.push(40);
        s.push(30);

        pushBottom(100,s);
        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
