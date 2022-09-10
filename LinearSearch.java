import java.util.Scanner;
public class LinearSearch {
    public static void main(String args[])
    {
        int i,item,size,f=0;
        System.out.println("Enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        int arr[] = new int[size];
        for(i=0;i<size;i++)
            arr[i]=sc.nextInt();
        System.out.println("Enter vlaue for search: ");
        item = sc.nextInt();
        for(i=0;i<size;i++)
        {
            if(item==arr[i])
            {
                f=f+1;
                System.out.println("datta is found");
            }
        }
        if(f==0)
        {
            System.out.println("data is not found");
        }
    }
}



