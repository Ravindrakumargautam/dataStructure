import java.util.*;
public class Single_linkedlist_FrameWork {
    public static void main(String args[])
    {
        LinkedList<String> list = new LinkedList<>();
        //LinkedList<Interger> list = new LinkedList<Interger>();
        list.addFirst("ravi");
        list.addFirst("kumar");
        System.out.println(list);
        list.addLast("gautam");
        System.out.println(list);
        list.add("ji");            // by default add() function add value in last
        System.out.println(list);
        System.out.println(list.size());
        for(int i=0; i<list.size();i++)
        {
            System.out.print(list.get(i)+"->");
        }
        System.out.println("null");

        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.remove(1);
        System.out.println(list);


    }
}
