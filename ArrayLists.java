import java.util.ArrayList;
import java.util.Collections;
public class ArrayLists {
    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(5);
        System.out.println(list);
        int element = list.get(2);
        System.out.println(element);
        
        // add el in betwen
        list.add(0,2);
        System.out.println(list);

        //set the element

        list.set(1,10);
        System.out.println(list);

        // delete ele
        list.remove(3);
        System.out.println(list);

        //size of list
        int size = list.size();
        System.out.println(size);

        //iteration
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i));
        }

        //sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
