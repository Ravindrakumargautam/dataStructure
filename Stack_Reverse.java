import java.util.*;
public class Stack_Reverse {

    public static void  addAtBottom(String str, Stack<String> s)
    {
        if(s.isEmpty())
        {
            s.push(str);
            return;
        }
        String top = s.pop();
        addAtBottom(str,s);
        s.push(top);
    }

    public static void reverse(Stack<String> s)
    {
        if(s.isEmpty())
        {
            return;
        }
        String top = s.pop();
        reverse(s);
        addAtBottom(top, s);
        //s.push(top);
    }

    public static void main(String args[])
    {
        Stack<String> s = new Stack<>();
        s.push("ravi");
        s.push("kumar");
        s.push("gautem");

        reverse(s);
        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();

        }
    }
}
