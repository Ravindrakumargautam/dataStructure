import java.util.Scanner;
//public static void search(int , int, int, int);
public class BinarySearch {
    public static void main(String args[])
    {
        int i,item,size;
        System.out.println("Enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        int arr[] = new int[size];
        for(i=0;i<size;i++)
            arr[i]=sc.nextInt();
        System.out.println("Enter vlaue for search: ");
        item = sc.nextInt();
        int re = search(item,arr,0,size-1);
        if(re!=1)
        System.out.println("data is not fount ");
        sc.close();
    } 
    

public static int search(int item, int arr[], int s, int end)
{
    if(end>=s)
    {
        int mid=(s+end)/2;
        if(arr[mid]==item)
        {
            System.out.println("data is fount "+mid+" location");
            return 1;
        }
        else{
            if(item>arr[mid])
                search(item,arr,mid+1,end);
            else
                search(item,arr,s,mid-1);
        }
    }
    
    return -1;
}
}